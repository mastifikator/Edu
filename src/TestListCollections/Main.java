package TestListCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = RandomArrayListGenerator.giveMeIntList(10000);
        ArrayList<String> stringArray = RandomArrayListGenerator.giveMeStringList(10000);
        ArrayList<Date> dateArray = RandomArrayListGenerator.giveMeDateList(10000);

        LinkedList<Integer> intLinked = new LinkedList<>(RandomArrayListGenerator.giveMeIntList(10000));
        LinkedList<String> stringLinked = new LinkedList<>(RandomArrayListGenerator.giveMeStringList(10000));
        LinkedList<Date> dateLinked = new LinkedList<>(RandomArrayListGenerator.giveMeDateList(10000));

        Vector<Integer> intVector = new Vector<>(RandomArrayListGenerator.giveMeIntList(10000));
        Vector<String> stringVector = new Vector<>(RandomArrayListGenerator.giveMeStringList(10000));
        Vector<Date> dateVector = new Vector<>(RandomArrayListGenerator.giveMeDateList(10000));

        //На вход принимаются String, Integer, Date
        SpeedArrayList testArray = new SpeedArrayList(stringArray);
        SpeedLinkedList testLinked = new SpeedLinkedList(stringLinked);
        SpeedVector testVector = new SpeedVector(stringVector);

        testArray.add(10000);
        testLinked.add(10000);
        testVector.add(10000);

        testArray.get(10000);
        testLinked.get(10000);
        testVector.get(10000);

        testArray.remove(5000);
        testLinked.remove(5000);
        testVector.remove(5000);
    }
}
