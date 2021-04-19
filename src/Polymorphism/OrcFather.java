package Polymorphism;

public abstract class OrcFather {

    public OrcFather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String name;
    protected int age;

    public boolean getWaaagh() {
        return waaagh;
    }

    public void setWaaagh(boolean waaagh) {
        this.waaagh = waaagh;
    }

    protected boolean waaagh;

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }


    protected int power;
    protected int speed;
    protected int health;


    protected void battleRoar(String roar){
        System.out.println(roar);
    }

    protected void beat(){
        System.out.println("Орк " + name + " бьет с силой " + power);
    }

    protected void run(){
        System.out.println("Орк " + name + " бежит со скоростью " + speed);
    }

}
