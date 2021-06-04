package Patterns.AbstractFactory;

public class OrcMage extends Unit implements Mage {

    public OrcMage(){
        System.out.println("Шаман рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Шаман погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Шаман двигается");
    }

    @Override
    public void magicFight() {
        System.out.println("Шаман метает молнию");
    }
}
