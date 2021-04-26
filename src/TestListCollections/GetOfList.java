package TestListCollections;
import java.util.*;

public class GetOfList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void get(int countOperationsGet, List array, String COLLECTION_TYPE) {
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
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте ArrayList или inkedList");
        }

        //Производим операцию получения элементов и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsGet; i++) {
            list.get(i);
        }
        long finish = System.nanoTime();

        String nameOperation = "получено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, list.size(), finish - start);
    }
}
