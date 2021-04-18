package OOP;

public class OrcBugai extends OrcFather{

    public OrcBugai(String name, int age) {
        super(name, age);
        this.power = 3;
        this.speed = 3;
        this.health = 300;
    }

    @Override
    protected void battleRoar(String roar) {
        super.battleRoar("Заг - Заг " + roar);
    }

    protected void Bloodlust(){
        power *= 2;
    }

}
