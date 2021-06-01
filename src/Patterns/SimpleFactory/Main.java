package Patterns.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        SimpleUnitFactory unitFactory = new SimpleUnitFactory();

        Orc orc = (Orc)unitFactory.createUnit(UnitType.ORC);
        orc.moveUnit();
        Human human = (Human) unitFactory.createUnit(UnitType.HUMAN);
        human.fightUnit();
        NightElf nightElf = (NightElf) unitFactory.createUnit(UnitType.NIGHT_ELF);
        nightElf.moveUnit();
        Undead undead = (Undead) unitFactory.createUnit(UnitType.UNDEAD);
        undead.deadUnit();

    }

}
