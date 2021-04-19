package Interfaces;

public class Dog extends Neutrals{
    public Dog() {
        this.name = "Собака";
        this.healthPoint = 50;
        this.moveSpeed = 3;
        this.damage = 0;
        this.armor = 0;
    }

    @Override
    public void scared() {
        super.scared();
    }
}
