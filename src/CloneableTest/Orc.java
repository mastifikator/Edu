package CloneableTest;

public class Orc implements Cloneable {
    String name;
    Integer Strength;
    Integer Speed;
    Weapon weapon;

    public Orc(String name, Integer strength, Integer speed) {
        this.name = name;
        Strength = strength;
        Speed = speed;
        this.weapon = new Weapon("Секира", 3,3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return Strength;
    }

    public void setStrength(Integer strength) {
        Strength = strength;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + name + '\'' +
                ", Strength=" + Strength +
                ", Speed=" + Speed +
                ", Weapon=" + weapon.name +
                '}';
    }

    @Override
    protected Orc clone() throws CloneNotSupportedException {
        Orc newOrc = (Orc) super.clone();
        newOrc.weapon = (Weapon)weapon.clone();
        return newOrc;
    }
}
