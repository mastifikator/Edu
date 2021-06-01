package EduCollections.TestSetCollections;

import java.util.HashSet;
import java.util.Set;

public class SpeedHashSet {

    private HashSet hashSet;
    private final String COLLECTION_TYPE = "HashSet";

    public SpeedHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public void add(Set addedSet) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToSet.add(addedSet, hashSet, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfSet.get(countOperationsGet, hashSet, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfSet.remove(countOperationsRemove, hashSet, COLLECTION_TYPE);
        }

    }