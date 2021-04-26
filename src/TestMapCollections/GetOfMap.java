package TestMapCollections;

import java.util.*;

public class GetOfMap {
    static String outPrint = "В %s было %d пар %s - %s, %s %d, осталось %d, заняло %o нс \n";

    public static void get(int countOperationsGet, Map inMap, String COLLECTION_TYPE) {
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

        //Производим операцию получения элементов и замеряем скорость
        int startElements = map.size();
        long start = System.nanoTime();
        Iterator<Map> getIter = map.entrySet().iterator();
        for (int i = 0; i < countOperationsGet; i++) {
            getIter.next();
        }
        long finish = System.nanoTime();

        String nameOperation = "получено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeKeyVariable, typeValueVariable, nameOperation, countOperationsGet, map.size(), finish - start);
    }
}
