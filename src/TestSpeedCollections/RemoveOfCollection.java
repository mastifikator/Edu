package TestSpeedCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class RemoveOfCollection {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void RemoveOfCollection(int countOperationsRemove, ArrayList array, String COLLECTION_TYPE) {

        ArrayList arrayList;
        String typeVariable;

        if(array.get(0) instanceof String){
            arrayList = new ArrayList<String>(array);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            arrayList = new ArrayList<Integer>(array);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            arrayList = new ArrayList<Date>(array);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        int startElements = array.size();
        long start = System.nanoTime();
        int delCount = countOperationsRemove;
        for (Iterator<Integer> i = arrayList.iterator(); i.hasNext() && delCount > 0; delCount--) {
            i.next();
            i.remove();
        }
        long finish = System.nanoTime();

        String nameOperation = "удалено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, arrayList.size(), finish - start);
    }
}
