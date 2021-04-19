package Polymorphism;

public class OrcRaider extends OrcFather{
    public OrcRaider(String name, int age){
        super(name, age);
        this.power = 3;
        this.speed = 5;
        this.health = 500;
    }

    @Override
    protected void battleRoar(String roar) {
        super.battleRoar("Вуф вуф " + roar);
    }

    protected void increaseSpeed(){
        speed *= 2;
    }

}
