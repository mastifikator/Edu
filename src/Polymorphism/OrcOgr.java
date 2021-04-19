package Polymorphism;

public class OrcOgr extends OrcFather {

    public OrcOgr(String name, int age){
        super(name, age);
        this.power = 8;
        this.speed = 2;
        this.health = 1000;
    }

    @Override
    public void battleRoar(String roar) {
        super.battleRoar("Огр палка бить " + roar);
    }

    public void increaseHealth(){
        health += 500;
    }
}
