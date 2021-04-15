package Enum;

public class OrcBarracks {
    private OrcWarriors orcWarriorType;


    public OrcBarracks(){
        System.out.println("Хозяин, построены Бараки!");
    }

    public void setOrcWarriors(OrcWarriors orcWarriorType){
        this.orcWarriorType = orcWarriorType;
    }

    public OrcWarrior produceOrcWarrior(String name){
        OrcWarrior orcWarrior = new OrcWarrior(orcWarriorType, name);
        System.out.println("Хозяин, в бараках произведен новый воин Орды " + orcWarrior.getType() + " " + orcWarrior.getName() +
                " Это нам стоило " + orcWarrior.getCost() + " монет");
        return orcWarrior;
    }


}
