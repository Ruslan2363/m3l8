public class Main {
    public static void main(String[] args) {
Actions actions1=new Actions("APPL",100,141);
Actions actions2=new Actions("COKE",1000,387);
Actions actions3=new Actions("IBM",200,137);
        System.out.println(actions1);
        System.out.println(actions2);
        System.out.println(actions3);
 Person person1=new Person("Alice",new Actions("AAPL",10,100),new Actions("COKE",20,390));
 Person person2=new Person("Bob",new Actions("AAPL",10,140),new Actions("IBM",20,135));
 Person person3=new Person("Charlie",new Actions("COKE",300,307));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}