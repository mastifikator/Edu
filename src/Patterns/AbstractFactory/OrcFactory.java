package Patterns.AbstractFactory;

public class OrcFactory implements AbstractUnitFactory {
    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Mage createMage() {
        return new OrcMage();
    }
}
