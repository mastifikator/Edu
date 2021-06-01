package Patterns.FactoryMethod;

public class Orc extends Unit {
    public Orc(){
        System.out.println("Орк рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Орк погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Орк двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println("Орк сражается");
    }
}
