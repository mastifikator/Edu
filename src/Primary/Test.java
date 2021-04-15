package Primary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Integer[] i = new Integer[]{2, 5, 7, 2, 3, 1};
        List<Integer> intArray = Arrays.asList(i);

        Collections.sort(intArray, Collections.reverseOrder());

        System.out.println(intArray);

    }
}
