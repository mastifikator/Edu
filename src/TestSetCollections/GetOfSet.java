package TestSetCollections;

import java.util.*;

public class GetOfSet {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void get(int countOperationsGet, Set inSet, String COLLECTION_TYPE) {
        Set set;
        Iterator iter = inSet.iterator();
        String typeVariable = iter.next().getClass().getSimpleName();

        //Определяем тип Set оступившего на вход
        if(inSet instanceof HashSet){
            set = new HashSet(inSet);
        }else if (inSet instanceof LinkedHashSet){
            set = new LinkedHashSet(inSet);
        }else if (inSet instanceof SortedSet){
            set = new TreeSet(inSet);
        }  else {
            throw new IllegalArgumentException("Введен не поддерживаемый тип Set, используйте наследников Set");
        }

        //Производим операцию получения элементов и замеряем скорость
        int startElements = set.size();
        long start = System.nanoTime();
        Iterator getIter = set.iterator();
        for (int i = 0; i < countOperationsGet; i++) {
            getIter.next();
        }
        long finish = System.nanoTime();

        String nameOperation = "получено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, set.size(), finish - start);
    }
}
