import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Action actions1=new Action("APPL",100,141);
        Action actions2=new Action("COKE",1000,387);
        Action actions3=new Action("IBM",200,137);
        System.out.println(actions1);
        System.out.println(actions2);
        System.out.println(actions3);
        List<Action> actions = new ArrayList();
        actions.add(actions1);
        actions.add(actions2);
        actions.add(actions3);

        Person person1=new Person("Alice", (List <Action>)new Action("COKE",20,390),new Action("AAPL",10,100));
        Person person2=new Person("Bob",(List<Action>)new Action("AAPL",10,140),new Action("IBM",20,135));
        Person person3=new Person("Charlie", (List<Action>) new Action("COKE",300,307));


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        PriceChange.change();
    }
}