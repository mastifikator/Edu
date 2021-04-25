package TestListCollections;

import java.util.LinkedList;
import java.util.Vector;

public class SpeedVector {

    private Vector array;
    private final String COLLECTION_TYPE = "Vector";

    public SpeedVector(Vector array) {
        this.array = array;
    }

    public void add(int countOperationsAdd) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToList.AddToBegin(countOperationsAdd, array, COLLECTION_TYPE);
            AddToList.AddToEnd(countOperationsAdd, array, COLLECTION_TYPE);
            AddToList.AddToMiddle(countOperationsAdd, array, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfList.GetOfCollection(countOperationsGet, array, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfList.RemoveOfCollection(countOperationsRemove, array, COLLECTION_TYPE);
        }

    }