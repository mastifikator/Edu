package TestSpeedCollections;
import java.util.ArrayList;
import java.util.Date;

public class AddToCollection {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void AddToBegin(int countOperationsAdd, ArrayList array, String COLLECTION_TYPE) {

        ArrayList arrayList;
        ArrayList randomArray;
        String typeVariable;

        if(array.get(0) instanceof String){
            arrayList = new ArrayList<String>(array);
            randomArray = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            arrayList = new ArrayList<Integer>(array);
            randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            arrayList = new ArrayList<Date>(array);
            randomArray = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(randomArray.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в начало";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }

    public static void AddToEnd(int countOperationsAdd, ArrayList array, String COLLECTION_TYPE) {
        ArrayList arrayList;
        ArrayList randomArray;
        String typeVariable;

        if(array.get(0) instanceof String){
            arrayList = new ArrayList<String>(array);
            randomArray = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            arrayList = new ArrayList<Integer>(array);
            randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            arrayList = new ArrayList<Date>(array);
            randomArray = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(0, randomArray.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в конец";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }

    public static void AddToMiddle(int countOperationsAdd, ArrayList array, String COLLECTION_TYPE) {
        ArrayList arrayList;
        ArrayList randomArray;
        String typeVariable;

        if(array.get(0) instanceof String){
            arrayList = new ArrayList<String>(array);
            randomArray = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            arrayList = new ArrayList<Integer>(array);
            randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            arrayList = new ArrayList<Date>(array);
            randomArray = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        int startElements = arrayList.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            arrayList.add(arrayList.size() / 2, randomArray.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в конец";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, arrayList.size(), finish - start);
    }
}
