import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Action actions1=new Action("APPL",100,141);
        Action actions2=new Action("COKE",1000,387);
        Action actions3=new Action("IBM",200,137);
        System.out.println(actions1);
        System.out.println(actions2);
        System.out.println(actions3);

        Person person1=new Person("Alice", Arrays.asList(new Action("COKE",20,390),new Action("AAPL",10,100)));
        Person person2=new Person("Bob", Arrays.asList(new Action("AAPL",10,140),new Action("IBM",20,135)));
        Person person3=new Person("Charlie",  Arrays.asList( new Action("COKE",300,307)));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Map<String, Integer> actionss=new HashMap<>();
        actionss.put("APPL",141);
        actionss.put("COKE",387);
        actionss.put("IBM",137);
        PriceChange mt1 = new PriceChange();
        mt1.startThread1();
    }


}