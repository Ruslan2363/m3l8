import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Action actions1 = new Action("APPL", 100, 141);
        Action actions2 = new Action("COKE", 1000, 387);
        Action actions3 = new Action("IBM", 200, 137);
        System.out.println(actions1);
        System.out.println(actions2);
        System.out.println(actions3);

        Person person1 = new Person("Alice", Arrays.asList(new Action("COKE", 20, 390), new Action("AAPL", 10, 100)));
        Person person2 = new Person("Bob", Arrays.asList(new Action("AAPL", 10, 140), new Action("IBM", 20, 135)));
        Person person3 = new Person("Charlie", Arrays.asList(new Action("COKE", 300, 307)));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        List<Person> myList = new ArrayList<>();
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);


        Map<String, Integer> Actions = new HashMap<>();
        Actions .put("APPL", 141);
        Actions .put("COKE", 387);
        Actions .put("IBM", 137);


        int durationInMinutes = 10;
        PriceChange mt1 = new PriceChange();
        mt1.startThread1();
        broker mt2 =new broker();
        mt2.startThread2();
    }
}
