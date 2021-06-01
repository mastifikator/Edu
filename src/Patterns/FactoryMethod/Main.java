package Patterns.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createUnit();
        human.moveUnit();

        OrcFactory orcFactory = new OrcFactory();
        Orc orc = orcFactory.createUnit();
        orc.fightUnit();

        UndeadFactory undeadFactory = new UndeadFactory();
        Undead undead = undeadFactory.createUnit();
        undead.moveUnit();

        NightElfFactory nightElfFactory = new NightElfFactory();
        NightElf nightElf = nightElfFactory.createUnit();
        nightElf.fightUnit();

    }

}
