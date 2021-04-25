package TestListCollections;
import java.util.*;

public class AddToList {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void AddToBegin(int countOperationsAdd, List array, String COLLECTION_TYPE) {
        List list;
        ArrayList randomList;
        String typeVariable;

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

        //Определяем тип данных List поступившего на вход
        if(array.get(0) instanceof String){
            randomList = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            randomList = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            randomList = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        //Производим операцию добавления в начало и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            list.add(randomList.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в начало";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, list.size(), finish - start);
    }

    public static void AddToEnd(int countOperationsAdd, List array, String COLLECTION_TYPE) {
        List list;
        ArrayList randomArray;
        String typeVariable;

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

        //Определяем тип данных List поступившего на вход
        if(array.get(0) instanceof String){
            randomArray = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            randomArray = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        //Производим операцию добавления в конец и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            list.add(0, randomArray.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в конец";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, list.size(), finish - start);
    }

    public static void AddToMiddle(int countOperationsAdd, List array, String COLLECTION_TYPE) {
        List list;
        List randomArray;
        String typeVariable;

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

        //Определяем тип данных List поступившего на вход
        if(array.get(0) instanceof String){
            randomArray = RandomArrayListGenerator.giveMeStringList(countOperationsAdd);
            typeVariable = "String";
        }else if(array.get(0) instanceof Integer){
            randomArray = RandomArrayListGenerator.giveMeIntList(countOperationsAdd);
            typeVariable = "Integer";
        }else if(array.get(0) instanceof Date){
            randomArray = RandomArrayListGenerator.giveMeDateList(countOperationsAdd);
            typeVariable = "Data";
        }else {
            throw new IllegalArgumentException("На вход пришли не поддерживаемые данные проверьте Generic значения");
        }

        //Производим операцию добавления в середину и замеряем скорость
        int startElements = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < countOperationsAdd; i++) {
            list.add(list.size() / 2, randomArray.get(i));
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено в середину";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsAdd, list.size(), finish - start);
    }
}
