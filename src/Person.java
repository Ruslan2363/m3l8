import javax.swing.plaf.basic.BasicSliderUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String names;

    private List<Action> target = new ArrayList();



    public Person(String names, List<Action> target){
        this.names=names;
        this.target= (List<Action>) target;
        Action ArrayList;

   }




    public void setTarget(List<Action> target) {
        this.target = target;
    }

    public List<Action> getTarget() {
        return target;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }



    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                ", target=" + target +
                '}';
    }
}