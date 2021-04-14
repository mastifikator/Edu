package EduCollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();

        for(int i = 0; i < 20; i++)
        set.add(i);

        set.remove(12);

        for(Integer x: set) System.out.print(x + " ");
    }
}
