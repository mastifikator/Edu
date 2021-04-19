package Interfaces;

public abstract class Humans extends Units implements UnitsAction, BattleActions {

    public boolean isHolyAura() {
        return holyAura;
    }

    public void setHolyAura(boolean holyAura) {
        this.holyAura = holyAura;
    }

    boolean holyAura;
}
