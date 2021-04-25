package TestListCollections;
import java.util.*;

public class RemoveOfList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void RemoveOfCollection(int countOperationsRemove, List array, String COLLECTION_TYPE) {
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

        if(array.get(0) instanceof String){
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        int startElements = array.size();
        long start = System.nanoTime();
        int delCount = countOperationsRemove;
        for (Iterator<Integer> i = list.iterator(); i.hasNext() && delCount > 0; delCount--) {
            i.next();
            i.remove();
        }
        long finish = System.nanoTime();

        String nameOperation = "удалено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, list.size(), finish - start);
    }
}
