package EduCollections.TestMapCollections;

import java.util.HashMap;
import java.util.TreeMap;

public class SpeedTreeMap {

    private TreeMap treeMap;
    private final String COLLECTION_TYPE = "TreeMap";

    public SpeedTreeMap(TreeMap treeMap) {
        this.treeMap = treeMap;
    }

    public void add(HashMap addedMap) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToMap.add(addedMap, treeMap, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfMap.get(countOperationsGet, treeMap, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfMap.remove(countOperationsRemove, treeMap, COLLECTION_TYPE);
        }
    }