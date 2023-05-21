import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class broker extends Thread {
    public static final Object LOCK = new Object();
    private Map<String, Integer> Actions;
    private List<Person> myList;

    public Map<String, Integer> getActions() {
        return Actions;
    }

    public void setActions(Map<String, Integer> Actions) {
        this.Actions = Actions;
    }

    public void startThread2() {

        Thread thr = new Thread(this, "MyThread2");

        thr.start();

    }

    public void run() {
        System.out.println("MyThread2.run() - Запущено");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (LOCK) {
            LOCK.notify();

            for (Person person : myList) {

                List<Action> personActions = (List<Action>) person.getTarget();


                for (Action action : personActions) {

                    String actionName = action.getName();
                    int actionQuantity = action.getAmount();
                    int actionPrice = action.getPrice();


                    int totalPrice = actionQuantity * actionPrice;
                    System.out.println(person.getName() + " купив " + actionQuantity  + " акцій " + actionName + " по ціні " + actionPrice + ". По суммі: " + totalPrice);
                }
            }
        }
    }
}