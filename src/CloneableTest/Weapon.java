package CloneableTest;

public class Weapon implements Cloneable {
    String name;
    Integer damage;
    Integer attackSpeed;

    public Weapon(String name, Integer damage, Integer attackSpeed) {
        this.name = name;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Integer attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", attackSpeed=" + attackSpeed +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
