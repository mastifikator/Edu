package TestListCollections;

import java.util.LinkedList;
import java.util.List;

public class SpeedLinkedList {

    private LinkedList array;
    private final String COLLECTION_TYPE = "LinkedList";

    public SpeedLinkedList(LinkedList array) {
        this.array = array;
    }

    public void add(List addedList) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToList.AddToBegin(addedList, array, COLLECTION_TYPE);
            AddToList.AddToEnd(addedList, array, COLLECTION_TYPE);
            AddToList.AddToMiddle(addedList, array, COLLECTION_TYPE);
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