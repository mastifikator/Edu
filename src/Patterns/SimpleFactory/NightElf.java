package Patterns.SimpleFactory;

public class NightElf extends Unit{
    public NightElf(){
        System.out.println("Ночной эльф рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Ночной эльф погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Ночной эльф двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println("Ночной эльф сражается");
    }
}
