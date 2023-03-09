
public class Person {
    private String names;
    private Actions target;
    private Actions target1;


    public Person(String names, Actions target, Actions target1){
        this.names=names;
        this.target=target;
        this.target1=target1;
    }

    public Person(String names, Actions target) {
        this.names=names;
        this.target=target;
    }

    public Actions getTarget1() {
        return target1;
    }

    public void setTarget1(Actions target1) {
        this.target1 = target1;
    }

    public Actions getTarget() {
        return target;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setTarget(Actions target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                ", target=" + target +
                ", target1=" + target1 +
                '}';
    }
}
