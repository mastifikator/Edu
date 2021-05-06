package ComparableVsComparator;

import java.util.Objects;

public class Human {
    private String name;
    private Integer strength;
    private Integer speed;

    public Human(String name, Integer strength, Integer speed) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }

    public Human(String name) {
        this.name = name;
    }

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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return strength == human.strength && speed == human.speed && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, speed);
    }
}
