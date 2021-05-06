package ComparableVsComparator;

import java.util.Comparator;
import java.util.Map;

public class HumanOrcMapComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        }else{
            return o1.getStrength().compareTo(o2.getStrength());
        }
    }
}
