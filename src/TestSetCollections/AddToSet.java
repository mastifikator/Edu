package TestSetCollections;

import java.util.*;

public class AddToSet {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void add(Set addedSet, Set inSet, String COLLECTION_TYPE) {
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

        //Производим операцию добавления и замеряем скорость
        int startElements = set.size();
        long start = System.nanoTime();
        Iterator addIter = addedSet.iterator();
        while (addIter.hasNext()){
            set.add(addIter.next());
        }
        long finish = System.nanoTime();

        String nameOperation = "добавлено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, addedSet.size(), set.size(), finish - start);
    }
}
