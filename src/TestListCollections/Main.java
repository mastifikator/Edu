package TestListCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = RandomArrayListGenerator.giveMeIntList(10000);
        ArrayList<String> stringArray = RandomArrayListGenerator.giveMeStringList(10000);
        ArrayList<Date> dateArray = RandomArrayListGenerator.giveMeDateList(10000);

        LinkedList<Integer> intLinked = new LinkedList<>(RandomArrayListGenerator.giveMeIntList(10000));
        LinkedList<String> stringLinked = new LinkedList<>(RandomArrayListGenerator.giveMeStringList(10000));
        LinkedList<Date> dateLinked = new LinkedList<>(RandomArrayListGenerator.giveMeDateList(10000));

        SpeedArrayList testArray = new SpeedArrayList(intArray);
        SpeedLinkedList testLinked = new SpeedLinkedList(intLinked);

        testArray.testArrayListAdd(10000);
        testLinked.testArrayListAdd(10000);

        testArray.testArrayListGet(10000);
        testLinked.testArrayListGet(10000);

        testArray.testArrayListRemove(5000);
        testLinked.testArrayListRemove(5000);
    }
}
