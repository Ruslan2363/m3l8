import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class PriceChange extends Thread {
    private List<Action> actions;
    public static final Object LOCK = new Object();

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }


    public static void change() {

        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number = (int) 0.03;
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
                    .map(x -> x * 141)
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
                        .map(x -> x * 387)
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
                        .map(x -> x * 137)
                        .reduce(Integer::sum);
                System.out.println(LocalTime.now() + ":" + "IBM changed the price to:" + sum.get());
            }
        } finally {

        }
    }
}
