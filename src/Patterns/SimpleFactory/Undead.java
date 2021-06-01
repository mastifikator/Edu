package Patterns.SimpleFactory;

public class Undead extends Unit{
    public Undead(){
        System.out.println("Нежить рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Нежить погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Нежить двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println("Нежить сражается");
    }
}
