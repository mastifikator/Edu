package Patterns.Mediator;

public abstract class Unit {
    protected String name;
    protected double damage;
    protected double health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void dealDamage(Unit unitAttacker, Unit unitAttacked){
        DamageMediator damageMediator = new DamageMediator(unitAttacker, unitAttacked);
        battleRoar(unitAttacked.getName());
    }

    public abstract void battleRoar(String nameAttacked);

    public abstract void dead();

}
