package Interfaces;

public interface BattleActions {

    default void beat(Units target, int damage) {
        System.out.println(" Нанес " + target.name + " " + Helpers.armorDamage(target.armor, damage));
    }

    void cast(Units target, Object spell);
    void battleRoar(String roar);
}
