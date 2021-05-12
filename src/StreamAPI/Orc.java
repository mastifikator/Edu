package StreamAPI;

public class Orc {
    private String name;
    private int strength;
    private int speed;

    public Orc(String name, int strength, int speed) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }

    public Orc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                '}';
    }
}
