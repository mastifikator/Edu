package TestMapCollections;

import Primary.Test;
import Randomizer.ArrayListsToMap;
import Randomizer.RandomArrayListGenerator;
import Randomizer.TestObject;
import TestListCollections.SpeedArrayList;
import TestListCollections.SpeedLinkedList;
import TestListCollections.SpeedVector;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {
        //Создаем рандомные входные данные разных типов для всех наследников Map с помощью RandomArrayListGenerator и вспомогательного метода ArrayListsToMap.merge
        HashMap<Integer, Integer> intHashMap = new HashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeInteger(10000)));
        HashMap<String, String> stringHashMap = new HashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeString(10000)));
        HashMap<TestObject, TestObject> objectHashMap = new HashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeTestObject(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        HashMap<String, TestObject> stringObjectHashMap = new HashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        HashMap<Integer, TestObject> intObjectHashMap = new HashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeTestObject(10000)));

        LinkedHashMap<Integer, Integer> intLinkedHashMap = new LinkedHashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeInteger(10000)));
        LinkedHashMap<String, String> stringLinkedHashMap = new LinkedHashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeString(10000)));
        LinkedHashMap<TestObject, TestObject> objectLinkedHashMap = new LinkedHashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeTestObject(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        LinkedHashMap<String, TestObject> stringObjectLinkedHashMap = new LinkedHashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        LinkedHashMap<Integer, TestObject> intObjectLinkedHashMap = new LinkedHashMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeTestObject(10000)));

        TreeMap<Integer, Integer> intTreeMap = new TreeMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeInteger(10000)));
        TreeMap<String, String> stringTreeMap = new TreeMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeString(10000)));
        TreeMap<TestObject, TestObject> objectTreeMap = new TreeMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeTestObject(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        TreeMap<String, TestObject> stringObjectTreeMap = new TreeMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        TreeMap<Integer, TestObject> intObjectTreeMap = new TreeMap<>(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeInteger(10000), RandomArrayListGenerator.giveMeTestObject(10000)));

        //Создаем экземпляры тестов для всех типов List
        SpeedHashMap testHashMap = new SpeedHashMap(stringObjectHashMap);
        SpeedLinkedHashMap testLinkedHashMap = new SpeedLinkedHashMap(stringObjectLinkedHashMap);
        SpeedTreeMap testTreeMap = new SpeedTreeMap(stringObjectTreeMap);

        //Для теста на добавление необходимо подавать на вход сгенерированный List с помощью Randomizer (или свой)
        testHashMap.add(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        testLinkedHashMap.add(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));
        testTreeMap.add(ArrayListsToMap.merge(RandomArrayListGenerator.giveMeString(10000), RandomArrayListGenerator.giveMeTestObject(10000)));

        //Тестируем получение
        testHashMap.get(10000);
        testLinkedHashMap.get(10000);
        testTreeMap.get(10000);

        //Тестируем удаление
        testHashMap.remove(5000);
        testLinkedHashMap.remove(5000);
        testTreeMap.remove(5000);
    }
}
