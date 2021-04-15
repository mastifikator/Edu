package Enum;

public class OrcWarrior {
    private String name;
    private Integer damage;
    private Integer speed;
    private Integer cost;
    private OrcWarriors type;

    public String getName(){
        return this.name;
    }

    public Integer getCost(){
        return this.cost;
    }

    public OrcWarriors getType(){
        return this.type;
    }

    public OrcWarrior(OrcWarriors type, String name){
        this.type = type;
        this.name = name;

        switch(type){
            case OGR: this.damage = 5; this.speed = 2; this.cost = 200; break;
            case KODO: this.damage = 1; this.speed = 6; this.cost = 300; break;
            case BUGAI: this.damage = 3; this.speed = 3; this.cost = 100; break;
            case CHIEF: this.damage = 15; this.speed = 1; this.cost = 600; break;
            case RIDER: this.damage = 7; this.speed = 8; this.cost = 300; break;
            case OFFICER: this.damage = 10; this.speed = 2; this.cost = 400; break;
        }

        System.out.println("Грррааа! За Орду!");
    }

    public void orcBeat(){
        System.out.println("Орк " + type + " по имени " + name + " наносит " + damage + " урона врагу");
    }

    public void orcRun(){
        System.out.println("Орк " + type + " по имени " + name + " бежит со скоростью " + speed);
    }


}
