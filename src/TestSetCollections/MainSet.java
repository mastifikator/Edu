package TestSetCollections;

import Randomizer.RandomArrayListGenerator;
import Randomizer.TestObject;
import TestListCollections.SpeedArrayList;
import TestListCollections.SpeedLinkedList;
import TestListCollections.SpeedVector;
import com.sun.source.tree.Tree;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        //Создаем рандомные входные данные разных типов для всех наследников Set с помощью RandomArrayListGenerator
        HashSet<Integer> integerHashSet = new HashSet<>(RandomArrayListGenerator.giveMeInteger(10000));
        HashSet<String> stringHashSet = new HashSet<>(RandomArrayListGenerator.giveMeString(10000));
        HashSet<Date> dateHashSet = new HashSet<>(RandomArrayListGenerator.giveMeDate(10000));
        HashSet<TestObject> testObjectHashSet = new HashSet<>(RandomArrayListGenerator.giveMeTestObject(10000));

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(RandomArrayListGenerator.giveMeInteger(10000));
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>(RandomArrayListGenerator.giveMeString(10000));
        LinkedHashSet<Date> dateLinkedHashSet = new LinkedHashSet<>(RandomArrayListGenerator.giveMeDate(10000));
        LinkedHashSet<TestObject> testObjectLinkedHashSet = new LinkedHashSet<>(RandomArrayListGenerator.giveMeTestObject(10000));

        TreeSet<Integer> integerTreeSet = new TreeSet<>(RandomArrayListGenerator.giveMeInteger(10000));
        TreeSet<String> stringTreeSet = new TreeSet<>(RandomArrayListGenerator.giveMeString(10000));
        TreeSet<Date> dateTreeSet = new TreeSet<>(RandomArrayListGenerator.giveMeDate(10000));
        TreeSet<TestObject> testObjectTreeSet = new TreeSet<>(RandomArrayListGenerator.giveMeTestObject(10000));

        //Создаем экземпляры тестов для всех типов Set
        SpeedHashSet testHashSet = new SpeedHashSet(testObjectHashSet);
        SpeedLinkedHashSet testLinkedHashSet = new SpeedLinkedHashSet(testObjectLinkedHashSet);
        SpeedTreeSet testTreeSet = new SpeedTreeSet(testObjectTreeSet);

        //Тестируем добавление
        //Для теста на добавление необходимо подавать на вход сгенерированный Set с помощью Randomizer (или свой)
        testHashSet.add(new HashSet(RandomArrayListGenerator.giveMeTestObject(10000)));
        testLinkedHashSet.add(new LinkedHashSet(RandomArrayListGenerator.giveMeTestObject(10000)));
        testTreeSet.add(new TreeSet(RandomArrayListGenerator.giveMeTestObject(10000)));

        //Тестируем получение
        testHashSet.get(10000);
        testLinkedHashSet.get(10000);
        testTreeSet.get(10000);

        //Тестируем удаление
        testHashSet.remove(5000);
        testLinkedHashSet.remove(5000);
        testTreeSet.remove(5000);
    }
}
