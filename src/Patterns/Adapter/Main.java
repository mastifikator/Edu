package Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        OrcBarracks orcBarracks = new OrcBarracks();
        Orc orc = new Orc("Боря","кузнец",12);
        orcBarracks.enterToTheOrcBarracks(orc.tellMeTheOrcPassword());

        Human human = new Human("Владислав", "шпион", 23);
        orcBarracks.enterToTheOrcBarracks(human.tellMeTheHumanPassword());
        //Как войти человеку, используем адаптер

        HumanToOrcBarracksAdapter maskirovka = new HumanToOrcBarracksAdapter(human);
        orcBarracks.enterToTheOrcBarracks(maskirovka.tellMeTheOrcPassword());
        //Обман реализован
    }
}
