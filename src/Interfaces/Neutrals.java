package Interfaces;

import java.util.Random;

public abstract class Neutrals extends Units implements UnitsAction {

    public void scared(){
        Random r = new Random();
        this.move(r.nextInt(), r.nextInt());
    }

}
