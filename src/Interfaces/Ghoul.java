package Interfaces;

public class Ghoul extends Undeads {
    public Ghoul() {
        this.name = "Гуль";
        this.healthPoint = 400;
        this.moveSpeed = 3;
        this.damage = 2;
        this.armor = 1;
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
        damage += 1;
        System.out.println(target.name + " Увеличил повреждения до " + damage);
    }

    @Override
    public void battleRoar(String roar) {
        System.out.println("За Нерзула");
    }


}
