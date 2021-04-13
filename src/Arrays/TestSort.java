package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSort {

    static void infoArray(int[] array){
        System.out.println("Состояние массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {

        int[] array1 = {4, 76, 3, 66, 99, -99, 1, 0, -5, -2};
        infoArray(array1);
        Arrays.sort(array1);
        infoArray(array1);
        Arrays.sort(array1);
        infoArray(array1);
        Arrays.sort(array1);
        infoArray(array1);
    }
}
