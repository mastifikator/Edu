package EduCollections;

import java.util.*;

public class testMaps {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        intList = Arrays.asList(1, 2, 3, 4, 5);
        stringList = Arrays.asList("dha","adhf","hsash","ahdf","rereer");

        Map<Integer, String> map = new HashMap<Integer, String>();


        for (int i = 0; i <= 4; i++){
            map.put(intList.get(i), stringList.get(i));
        }

        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.println("Ключ: " + m.getKey() + " / " + "Значение: " + m.getValue());
        }

        ArrayList<String> valueList = new ArrayList<>(map.values());
        Set<Integer> keySet = new HashSet<>(map.keySet());
        List entryList = new ArrayList(map.entrySet());

        System.out.println("Ключи: " + keySet);
        System.out.println("Значения: " + valueList);
        System.out.println("Пары: " + entryList);

    }
}
