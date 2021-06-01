package Patterns.SimpleFactory;

public class SimpleUnitFactory {
    public Unit createUnit(UnitType type){
        Unit unit = null;

        switch (type){
            case ORC:
                unit = new Orc();
                break;
            case HUMAN:
                unit = new Human();
                break;
            case UNDEAD:
                unit = new Undead();
                break;
            case NIGHT_ELF:
                unit = new NightElf();
                break;
        }

        return unit;
    }
}
