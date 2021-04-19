package Interfaces;

public abstract class Undeads extends Units implements UnitsAction, BattleActions{

    public boolean isUnholyAura() {
        return unholyAura;
    }

    public void setUnholyAura(boolean unholyAura) {
        this.unholyAura = unholyAura;
    }

    boolean unholyAura;
}
