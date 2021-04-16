package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayToList {


    public static void main(String[] args) {

        Integer[] array = new Integer[30];

        for(int i = 0; i < 30; i++){
            array[i] = i;
            System.out.print(array[i] + " ");
        }


        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(array));
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("Преобразовали");

        for (Integer i : arrList){
            System.out.print(i +" ");
        }

        System.out.println("Обратно в массив");
        array = arrList.toArray(new Integer[0]);
        for(int i = 0; i < 30; i++){
            System.out.print(array[i] + " ");
        }
    }
}
