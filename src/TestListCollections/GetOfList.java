package TestListCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GetOfList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void GetOfCollection(int countOperationsGet, List array, String COLLECTION_TYPE) {
        List list;
        String typeVariable;

        //Определяем тип List оступившего на вход
        if(array instanceof ArrayList){
            list = new ArrayList(array);
        }else if (array instanceof LinkedList){
            list = new LinkedList(array);
        } else{
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте ArrayList или inkedList");
        }

        //Определяем тип данных List поступившего на вход
        if(array.get(0) instanceof String){
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
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