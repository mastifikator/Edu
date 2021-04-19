package Interfaces;

public class Footman extends Humans{

    public Footman(){
        this.name = "Футман";
        this.healthPoint = 80;
        this.moveSpeed = 3;
        this.damage = 8;
        this.armor = 2;
    }

    @Override
    public void move(int x, int y) {
        System.out.println(this.name + " двигается к координатам " + x + " " + y);
    }

    @Override
    public void beat(Units target, int damage) {
        System.out.println(name + " Нанес " + target.name + " " + Helpers.armorDamage(target.armor, damage));
    }

    @Override
    public void cast(Units target, Object spell) {
        target = this;
        armor += 1;
        System.out.println(target.name + " Увеличил броню до " + armor);
    }

    @Override
    public void battleRoar(String roar) {
        System.out.println("Боже храни короля!");
    }
}
