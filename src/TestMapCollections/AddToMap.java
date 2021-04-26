package TestMapCollections;

import com.sun.source.tree.Tree;

import java.util.*;

public class AddToMap {
    static String outPrint = "В %s было %d пар %s - %s, %s %d, осталось %d, заняло %o нс \n";

    public static void add(HashMap addedMap, Map inMap, String COLLECTION_TYPE) {
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

        //Производим операцию добавления и замеряем скорость
        int startElements = map.size();
        long start = System.nanoTime();
            map.putAll(addedMap);
        long finish = System.nanoTime();

        String nameOperation = "добавлено";
        System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeKeyVariable, typeValueVariable, nameOperation, addedMap.size(), map.size(), finish - start);
    }

}
