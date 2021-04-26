package TestSetCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SpeedTreeSet {

    private TreeSet treeSet;
    private final String COLLECTION_TYPE = "TreeSet";

    public SpeedTreeSet(TreeSet treeSet) {
        this.treeSet = treeSet;
    }

    public void add(Set addedSet) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToSet.add(addedSet, treeSet, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfSet.get(countOperationsGet, treeSet, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfSet.remove(countOperationsRemove, treeSet, COLLECTION_TYPE);
        }

    }