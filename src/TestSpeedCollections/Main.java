package TestSpeedCollections;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = RandomArrayListGenerator.giveMeIntList(1000);
        ArrayList<String> stringArray = RandomArrayListGenerator.giveMeStringList(1000);
        ArrayList<Date> listDate = RandomArrayListGenerator.giveMeDateList(1000);

        SpeedArrayList test1 = new SpeedArrayList(intArray);
        test1.testArrayListAdd(1000);
        test1.testArrayListGet(1000);
        test1.testArrayListRemove(2500);

    }
}
