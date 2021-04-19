package Interfaces;

public abstract class Orcs extends Units implements UnitsAction, BattleActions {

    public boolean isWaaagh() {
        return waaagh;
    }

    public void setWaaagh(boolean waaagh) {
        this.waaagh = waaagh;
    }



    private boolean waaagh;
}
