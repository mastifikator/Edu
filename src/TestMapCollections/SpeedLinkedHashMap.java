package TestMapCollections;

import TestSetCollections.AddToSet;
import TestSetCollections.GetOfSet;
import TestSetCollections.RemoveOfSet;

import java.util.*;

public class SpeedLinkedHashMap {

    private LinkedHashMap linkedHashMap;
    private final String COLLECTION_TYPE = "LinkedHashSet";

    public SpeedLinkedHashMap(LinkedHashMap linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }

    public void add(HashMap addedMap) {

        System.out.printf("\nТестируем скорость операций добавления элементов в %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            AddToMap.add(addedMap, linkedHashMap, COLLECTION_TYPE);
    }

    public void get(int countOperationsGet) {
        System.out.printf("\nТестируем скорость операций получения элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            GetOfMap.get(countOperationsGet, linkedHashMap, COLLECTION_TYPE);
    }

    public void remove(int countOperationsRemove) {
        System.out.printf("\nТестируем скорость операций удаления элементов из %s \n", COLLECTION_TYPE);
        System.out.println("--------------------------------------------------");

            RemoveOfMap.remove(countOperationsRemove, linkedHashMap, COLLECTION_TYPE);
        }
    }