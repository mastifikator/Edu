package TestSpeedCollections;
import java.util.ArrayList;
import java.util.Date;

public class GetOfCollection {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void GetOfCollection(int countOperationsGet, ArrayList array, String COLLECTION_TYPE) {

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

        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsGet; i++) {
            arrayList.get(i);
        }
        long finish = System.nanoTime();

        String nameOperation = "получено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, arrayList.size(), finish - start);
    }
}
