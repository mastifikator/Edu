package Interfaces;

public interface BattleActions {
    void beat(Units target, int damage);
    void cast(Units target, Object spell);
    void battleRoar(String roar);
}
