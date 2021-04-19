package Interfaces;

import java.util.HashMap;

interface UnitsAction {

    default void move(int x, int y) {
        System.out.println("двигается к координатам " + x + " " + y);
    }

    HashMap<String, Integer> aggroList = new HashMap<>();
    
}
