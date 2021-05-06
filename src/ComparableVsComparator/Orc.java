package ComparableVsComparator;

import java.util.Objects;

public class Orc implements Comparable<Orc> {
    private String name;
    private Integer strength;
    private Integer speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Orc(String name) {
        this.name = name;
    }

    public Orc(String name, Integer strength, Integer speed) {
        this.name = name;
        this.strength = strength;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orc orc = (Orc) o;
        return name.equals(orc.name) && Objects.equals(strength, orc.strength) && Objects.equals(speed, orc.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, speed);
    }

    @Override
    public int compareTo(Orc o) {
        if(strength + speed < o.strength + o.speed) return -1;
        else if (strength + speed > o.strength + o.speed) return 1;
        else return name.compareTo(o.name);
    }
}
