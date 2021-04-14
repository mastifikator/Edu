package EduCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        int volumeList = 1_000_000;
        int volumeMiddle = 500_000;
        int volumeAdd = 1_000_000;

        long firstStart = System.currentTimeMillis();
        for(int i = 0; i < volumeList; i++){
            arrayList.add(i);
            linkedList.add(i);
            //arrayList.add(new Integer(i));
        }
        System.out.println("Время первого заполнения списка " + (System.currentTimeMillis() - firstStart));

        long secondStart = System.currentTimeMillis();
        for(int i = 0; i < volumeAdd; i++){
            //arrayList.add( 0, i );
            linkedList.add( 0, i );
        }
        System.out.println("Время второго заполнения списка " + (System.currentTimeMillis() - firstStart));

    }
}
