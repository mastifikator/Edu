package ComparableVsComparator;

import java.util.Comparator;

public class HumanSpeedComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return o1.getSpeed().compareTo(o2.getSpeed());
    }
}
