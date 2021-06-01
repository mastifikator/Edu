package Patterns.AbstractFactory;

public class UndeadFactory implements AbstractUnitFactory {
    @Override
    public Warrior createWarrior() {
        return new UndeadWarrior();
    }

    @Override
    public Archer createArcher() {
        return new UndeadArcher();
    }

    @Override
    public Mage createMage() {
        return new UndeadMage();
    }
}


