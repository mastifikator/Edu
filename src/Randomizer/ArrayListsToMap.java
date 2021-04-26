package Randomizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListsToMap {

    public static HashMap merge (ArrayList keys, ArrayList values){
        HashMap map = new HashMap();

        for(int i = 0; i < keys.size() && i < values.size(); i++){
            map.put(keys.get(i), values.get(i));
        }

        return map;
    }
}
