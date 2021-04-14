package EduCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class testIterator {


    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 9, 12));

        for(Integer i : intList){

            System.out.print(i + " ");
        }

        System.out.println("");

        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()){
            Integer i = iter.next();
            if(i%2 == 0)iter.remove();
        }

        for(Integer i : intList){

            System.out.print(i + " ");
        }
    }


}
