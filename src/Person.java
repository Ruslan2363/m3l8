import javax.swing.plaf.basic.BasicSliderUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
     private List<Action> target = new ArrayList();



    public Person(String name, List<Action> target){
        this.name=name;
        this.target= (List<Action>) target;


   }




    public  void setTarget(Action  target) {
        this.target = (List<Action>) target;
    }

    public Action getTarget() {
        return (Action) target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Action > actions = new ArrayList();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", target=" + target +
                '}';
    }
}