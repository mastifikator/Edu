package TestSpeedCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class AddIntToCollection {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";
    static String typeVariable = "Integer";

    public static void AddToBegin(int countOperationsAdd, ArrayList<Integer> intArray, String COLLECTION_TYPE) {
        String nameOperation = "добавлено в начало";
        ArrayList<Integer> arrayList;
        ArrayList<Integer> randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);

        arrayList = new ArrayList<>(intArray);
        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(randomArray.get(i));
        }
        long finish = System.nanoTime();

        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }

    public static void AddToEnd(int countOperationsAdd, ArrayList<Integer> intArray, String COLLECTION_TYPE) {
        String nameOperation = "добавлено в конец";
        ArrayList<Integer> arrayList;
        ArrayList<Integer> randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);

        arrayList = new ArrayList<>(intArray);
        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(0, randomArray.get(i));
        }
        long finish = System.nanoTime();

        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }

    public static void AddToMiddle(int countOperationsAdd, ArrayList<Integer> intArray, String COLLECTION_TYPE) {
        String nameOperation = "добавлено в середину";
        ArrayList<Integer> arrayList;
        ArrayList<Integer> randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);

        arrayList = new ArrayList<>(intArray);
        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(arrayList.size() / 2, randomArray.get(i));
        }
        long finish = System.nanoTime();

        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }
}
