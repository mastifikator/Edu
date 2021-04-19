package Interfaces;

import java.util.HashMap;

interface UnitsAction {

    void move(int x, int y);

    HashMap<String, Integer> aggroList = new HashMap<>();
    
}
