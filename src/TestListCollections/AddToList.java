package TestListCollections;
import Randomizer.RandomArrayListGenerator;

import java.util.*;

public class AddToList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void AddToBegin(List addedList, List array, String COLLECTION_TYPE) {
        List list;
        String typeVariable = array.get(0).getClass().getSimpleName();

        //Определяем тип List оступившего на вход
        if(array instanceof ArrayList){
            list = new ArrayList(array);
        }else if (array instanceof LinkedList){
            list = new LinkedList(array);
        }else if (array instanceof Vector){
            list = new Vector(array);
        }  else {
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте наследников List");
        }

        //Производим операцию добавления в начало и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < addedList.size(); i++) {
            list.add(addedList.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в начало";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, addedList.size(), list.size(), finish - start);
    }

    public static void AddToEnd(List addedList, List array, String COLLECTION_TYPE) {
        List list;
        String typeVariable = array.get(0).getClass().getSimpleName();

        //Определяем тип List оступившего на вход
        if(array instanceof ArrayList){
            list = new ArrayList(array);
        }else if (array instanceof LinkedList){
            list = new LinkedList(array);
        }else if (array instanceof Vector){
            list = new Vector(array);
        }  else {
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте наследников List");
        }

        //Производим операцию добавления в конец и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < addedList.size(); i++) {
            list.add(0, addedList.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в конец";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, addedList.size(), list.size(), finish - start);
    }

    public static void AddToMiddle(List addedList, List array, String COLLECTION_TYPE) {
        List list;
        List randomArray;
        String typeVariable = array.get(0).getClass().getSimpleName();

        //Определяем тип List оступившего на вход
        if(array instanceof ArrayList){
            list = new ArrayList(array);
        }else if (array instanceof LinkedList){
            list = new LinkedList(array);
        }else if (array instanceof Vector){
            list = new Vector(array);
        }  else {
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте наследников List");
        }

        //Производим операцию добавления в середину и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < addedList.size(); i++) {
            list.add(list.size() / 2, addedList.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в середину";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, addedList.size(), list.size(), finish - start);
    }
}
