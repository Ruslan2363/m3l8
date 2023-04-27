import java.time.LocalTime;
import java.util.*;

public class PriceChange extends Thread {
    private Map<String, Integer> actionss;
    public static final Object LOCK = new Object();

    public Map<String, Integer> getActions() {
        return actionss;
    }

    public void setActions(Map<String, Integer> actions) {
        this.actionss = actions;
    }


    public  void startThread1() {

        Thread thr = new Thread( this,"MyThread1");

        thr.start();
    }


    public void run()  {
        System.out.println("MyThread1.run() - Запущено");
        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number = (int) 0.03 ;
        Random rnd = new Random();

        for (int i = 0; i < 1; i++) {
            AL.add(number);
        }
        try { Thread.sleep(30000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (LOCK) {
            LOCK.notify();
            Optional<Integer> sum = AL.stream()
                    .map(x -> x + 141)
                    .reduce(Integer::sum);
            System.out.println(LocalTime.now() + ":" + "AAPL changed the price to:" + sum.get());
        }

        try {
            Thread.sleep(30000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            synchronized (LOCK) {
                LOCK.notify();
                Optional<Integer> sum = AL.stream()
                        .map(x -> x + 387)
                        .reduce(Integer::sum);
                System.out.println(LocalTime.now() + ":" + "COKE changed the price to:" + sum.get());
            }
        try {
            Thread.sleep(30000);
        }
         catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            synchronized (LOCK) {
                LOCK.notify();
                Optional<Integer> sum = AL.stream()
                        .map(x -> x - 137)
                        .reduce(Integer::sum);
                System.out.println(LocalTime.now() + ":" + "IBM changed the price to:" + sum.get());
            }
        } finally {
            System.out.println("MyThread1.run() - Закінчено");
        }
    }
}
