package SpeedTestCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {};
        String[] stringArray = {};
        ArrayList<Date> listDate = new ArrayList<Date>(){};

        ListsVsSets test1 = new ListsVsSets(intArray);
        test1.testArrayList(10000);

        ListsVsSets test2 = new ListsVsSets(stringArray);
        test2.testArrayList(10000);

        ListsVsSets test3 = new ListsVsSets(listDate);
        test3.testArrayList(10000);

    }
}
