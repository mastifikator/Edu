package Interfaces;

public class Helpers {
    //Формула рассчета повреждений в зависимости от брони
    public static int armorDamage (int damage, int armor){
        return damage - armor;
    }
}
