package Patterns.AbstractFactory;

public class HumanArcher extends Unit implements Archer {

    public HumanArcher(){
        System.out.println("Стрелок рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Стрелок погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Стрелок двигается");
    }

    @Override
    public void rangeFight() {
        System.out.println("Стрелок стреляет из ружь");
    }
}
