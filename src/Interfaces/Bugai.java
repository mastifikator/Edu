package Interfaces;

public class Bugai extends Orcs {

    public Bugai(){
        this.name = "Бугай";
        this.healthPoint = 100;
        this.moveSpeed = 3;
        this.damage = 8;
        this.armor = 1;
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
        System.out.println("За орду!");
    }
}
