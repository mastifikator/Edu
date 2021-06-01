package EduCollections.TestListCollections;

import EduCollections.Randomizer.RandomArrayListGenerator;
import EduCollections.Randomizer.TestObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

public class MainList {

    public static void main(String[] args) {
        //Создаем рандомные входные данные разных типов для всех наследников List с помощью RandomArrayListGenerator
        ArrayList<Integer> intArray = RandomArrayListGenerator.giveMeInteger(10000);
        ArrayList<String> stringArray = RandomArrayListGenerator.giveMeString(10000);
        ArrayList<Date> dateArray = RandomArrayListGenerator.giveMeDate(10000);
        ArrayList<TestObject> objectArray = RandomArrayListGenerator.giveMeTestObject(10000);

        LinkedList<Integer> intLinked = new LinkedList<>(RandomArrayListGenerator.giveMeInteger(10000));
        LinkedList<String> stringLinked = new LinkedList<>(RandomArrayListGenerator.giveMeString(10000));
        LinkedList<Date> dateLinked = new LinkedList<>(RandomArrayListGenerator.giveMeDate(10000));
        LinkedList<TestObject> objectLinked = new LinkedList<>(RandomArrayListGenerator.giveMeTestObject(10000));

        Vector<Integer> intVector = new Vector<>(RandomArrayListGenerator.giveMeInteger(10000));
        Vector<String> stringVector = new Vector<>(RandomArrayListGenerator.giveMeString(10000));
        Vector<Date> dateVector = new Vector<>(RandomArrayListGenerator.giveMeDate(10000));
        Vector<TestObject> objectVector = new Vector<>(RandomArrayListGenerator.giveMeTestObject(10000));

        //Создаем экземпляры тестов для всех типов List
        SpeedArrayList testArray = new SpeedArrayList(objectArray);
        SpeedLinkedList testLinked = new SpeedLinkedList(objectLinked);
        SpeedVector testVector = new SpeedVector(objectVector);

        //Для теста на добавление необходимо подавать на вход сгенерированный List с помощью Randomizer (или свой)
        testArray.add(RandomArrayListGenerator.giveMeTestObject(10000));
        testLinked.add(RandomArrayListGenerator.giveMeTestObject(10000));
        testVector.add(RandomArrayListGenerator.giveMeTestObject(10000));

        //Тестируем получение
        testArray.get(10000);
        testLinked.get(10000);
        testVector.get(10000);

        //Тестируем удаление
        testArray.remove(5000);
        testLinked.remove(5000);
        testVector.remove(5000);
    }
}
