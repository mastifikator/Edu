package ComparableVsComparator;

import java.util.Comparator;

public class HumanStrengthComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return o1.getStrength().compareTo(o2.getStrength());
    }
}
