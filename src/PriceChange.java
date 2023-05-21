import java.time.LocalTime;
import java.util.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.time.chrono.JapaneseEra.values;

public class PriceChange extends Thread {
    private Map<String, Integer> Actions;
    public static final Object LOCK = new Object();
    int prc = 0;
    public Map<String, Integer> getActions() {
        return Actions;
    }

    public void setActions(Map<String, Integer> Actions) {
        this.Actions = Actions;
    }


    public  void startThread1() {

        Thread thr = new Thread( this,"MyThread1");

        thr.start();
    }


    public void run()  {
        System.out.println("MyThread1.run() - Запущено");

        try { TimeUnit.SECONDS.sleep(30);;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (LOCK) {
            LOCK.notify();
            if (Actions != null) {
                for (int value : Actions.values()) {
                    prc =  value + 3;
                }
            }
            System.out.println(LocalTime.now() +  ": changed the price to:" + prc);
        }


    }
}
