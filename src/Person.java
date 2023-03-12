public class Person {
    private String names;
    private Actions target;



    public Person(String names, Actions target){
        this.names=names;
        this.target=target;

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
                '}';
    }
}