package EduCollections.TestMapCollections;
import java.util.*;

public class RemoveOfMap {
    static String outPrint = "В %s было %d пар %s - %s, %s %d, осталось %d, заняло %o нс \n";

    public static void remove(int countOperationsRemove, Map inMap, String COLLECTION_TYPE) {
        Map map;
        Iterator<Map.Entry> iter = inMap.entrySet().iterator();
        String typeKeyVariable = iter.next().getKey().getClass().getSimpleName();
        String typeValueVariable = iter.next().getValue().getClass().getSimpleName();

        //Определяем тип Map оступившей на вход
        if(inMap instanceof HashMap){
            map = new HashMap(inMap);
        }else if (inMap instanceof LinkedHashMap){
            map = new LinkedHashMap(inMap);
        }else if (inMap instanceof TreeMap){
            map = new TreeMap(inMap);
        }  else {
            throw new IllegalArgumentException("Введен не поддерживаемый тип Map, используйте наследников Map");
        }

        int startElements = map.size();
        long start = System.nanoTime();
        int delCount = countOperationsRemove;
        for (Iterator i = map.entrySet().iterator(); i.hasNext() && delCount > 0; delCount--) {
            i.next();
            i.remove();
        }
        long finish = System.nanoTime();

        String nameOperation = "удалено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeKeyVariable, typeValueVariable, nameOperation, countOperationsRemove, map.size(), finish - start);
    }
}
