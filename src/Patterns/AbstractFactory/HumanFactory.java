package Patterns.AbstractFactory;

public class HumanFactory implements AbstractUnitFactory {
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }
}
