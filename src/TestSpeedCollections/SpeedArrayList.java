package TestSpeedCollections;

import java.util.*;

public class SpeedArrayList {

    private ArrayList array;
    private final String COLLECTION_TYPE = "ArrayList";

    public SpeedArrayList(ArrayList array) {
        this.array = array;
    }

    public void testArrayListAdd(int countOperationsAdd) {

        System.out.println("\nТестируем скорость операций добавления элементов в ArrayList");
        System.out.println("--------------------------------------------------");

            AddToCollection.AddToBegin(countOperationsAdd, array, COLLECTION_TYPE);
            AddToCollection.AddToEnd(countOperationsAdd, array, COLLECTION_TYPE);
            AddToCollection.AddToMiddle(countOperationsAdd, array, COLLECTION_TYPE);
    }

    public void testArrayListGet(int countOperationsGet) {
        System.out.println("\nТестируем скорость операции получения элементов из ArrayList");
        System.out.println("--------------------------------------------------");

            GetOfCollection.GetOfCollection(countOperationsGet, array, COLLECTION_TYPE);
    }

    public void testArrayListRemove(int countOperationsRemove) {
        System.out.println("\nТестируем скорость удаления элементов из ArrayList");
        System.out.println("--------------------------------------------------");

            RemoveOfCollection.RemoveOfCollection(countOperationsRemove, array, COLLECTION_TYPE);
        }

    }