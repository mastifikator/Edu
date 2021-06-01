package EduCollections.TestSetCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SpeedLinkedHashSet {

    private LinkedHashSet linkedHashSet;
    private final String COLLECTION_TYPE = "LinkedHashSet";

    public SpeedLinkedHashSet(LinkedHashSet linkedHashSet) {
        this.linkedHashSet = linkedHashSet;
    }

    public void add(Set addedSet) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToSet.add(addedSet, linkedHashSet, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfSet.get(countOperationsGet, linkedHashSet, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfSet.remove(countOperationsRemove, linkedHashSet, COLLECTION_TYPE);
        }
    }