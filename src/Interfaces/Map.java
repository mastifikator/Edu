package Interfaces;

public class Map {
    public static void main(String[] args) {
        Bugai bugai = new Bugai();
        Footman footman = new Footman();
        Ghoul ghoul = new Ghoul();
        Dog dog = new Dog();

        //Нужна многопоточность TODO
        while (footman.healthPoint > 0){
            bugai.beat(footman, bugai.damage);
            footman.healthPoint -= bugai.damage;
        }

        while (bugai.healthPoint > 0){
            footman.beat(bugai, footman.damage);
            bugai.healthPoint -= footman.damage;
        }

        while (dog.healthPoint > 0){
            ghoul.beat(dog, ghoul.damage);
            dog.healthPoint -= ghoul.damage;
            dog.scared();
        }

    }
}
