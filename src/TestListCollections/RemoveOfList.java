package TestListCollections;
import java.util.*;

public class RemoveOfList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void RemoveOfCollection(int countOperationsRemove, List array, String COLLECTION_TYPE) {
        List list;
        String typeVariable = array.get(0).getClass().getSimpleName();

        //Определяем тип List оступившего на вход
        if(array instanceof ArrayList){
            list = new ArrayList(array);
        }else if (array instanceof LinkedList){
            list = new LinkedList(array);
        } else if (array instanceof Vector){
            list = new Vector(array);
        } else{
            throw new IllegalArgumentException("Введен не поддерживаемый тип List, используйте ArrayList или inkedList");
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
