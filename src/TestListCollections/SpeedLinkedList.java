package TestListCollections;

import java.util.LinkedList;

public class SpeedLinkedList {

    private LinkedList array;
    private final String COLLECTION_TYPE = "LinkedList";

    public SpeedLinkedList(LinkedList array) {
        this.array = array;
    }

    public void testArrayListAdd(int countOperationsAdd) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToList.AddToBegin(countOperationsAdd, array, COLLECTION_TYPE);
            AddToList.AddToEnd(countOperationsAdd, array, COLLECTION_TYPE);
            AddToList.AddToMiddle(countOperationsAdd, array, COLLECTION_TYPE);
    }

    public void testArrayListGet(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfList.GetOfCollection(countOperationsGet, array, COLLECTION_TYPE);
    }

    public void testArrayListRemove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfList.RemoveOfCollection(countOperationsRemove, array, COLLECTION_TYPE);
        }

    }