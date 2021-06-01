package Patterns.AbstractFactory;

public interface AbstractUnitFactory {
    Warrior createWarrior();
    Archer createArcher();
    Mage createMage();
}
