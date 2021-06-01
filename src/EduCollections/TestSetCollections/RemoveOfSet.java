package EduCollections.TestSetCollections;
import java.util.*;

public class RemoveOfSet {
    static String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public static void remove(int countOperationsRemove, Set inSet, String COLLECTION_TYPE) {
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

        int startElements = set.size();
        long start = System.nanoTime();
        int delCount = countOperationsRemove;
        for (Iterator<Integer> i = set.iterator(); i.hasNext() && delCount > 0; delCount--) {
            i.next();
            i.remove();
        }
        long finish = System.nanoTime();

        String nameOperation = "удалено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, set.size(), finish - start);
    }
}
