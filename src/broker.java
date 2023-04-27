import java.time.LocalTime;
import java.util.*;
public class broker extends Thread {
    public static final Object LOCK = new Object();
    public  void startThread2() {

        Thread thr = new Thread( this,"MyThread2");

        thr.start();

    }
    public void run(){
        System.out.println("MyThread2.run() - Запущено");
    }
}

