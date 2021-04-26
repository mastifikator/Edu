package TestMapCollections;

import java.util.HashMap;
import java.util.Map;


public class SpeedHashMap {

    private HashMap hashMap;
    private final String COLLECTION_TYPE = "HashMap";

    public SpeedHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    public void add(HashMap addedMap) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToMap.add(addedMap, hashMap, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfMap.get(countOperationsGet, hashMap, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfMap.remove(countOperationsRemove, hashMap, COLLECTION_TYPE);
        }

    }