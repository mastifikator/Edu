package Enum;

public class Battle {
    public static void main(String[] args) {
        OrcBarracks orcBarracks = new OrcBarracks();
        orcBarracks.setOrcWarriors(OrcWarriors.BUGAI);

        OrcWarrior petr = orcBarracks.produceOrcWarrior("Петруха");
        petr.orcBeat();
        petr.orcRun();

        orcBarracks.setOrcWarriors(OrcWarriors.RIDER);
        OrcWarrior osetr = orcBarracks.produceOrcWarrior("Осетр");
        osetr.orcBeat();
        osetr.orcRun();

        orcBarracks.setOrcWarriors(OrcWarriors.CHIEF);
        OrcWarrior trall = orcBarracks.produceOrcWarrior("Тралл");
        trall.orcBeat();
        trall.orcRun();
    }
}
