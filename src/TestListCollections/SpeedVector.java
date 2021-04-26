package TestListCollections;

import java.util.List;
import java.util.Vector;

public class SpeedVector {

    private Vector array;
    private final String COLLECTION_TYPE = "Vector";

    public SpeedVector(Vector array) {
        this.array = array;
    }

    public void add(List addedList) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToList.addToBegin(addedList, array, COLLECTION_TYPE);
            AddToList.addToEnd(addedList, array, COLLECTION_TYPE);
            AddToList.addToMiddle(addedList, array, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfList.get(countOperationsGet, array, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfList.remove(countOperationsRemove, array, COLLECTION_TYPE);
        }

    }