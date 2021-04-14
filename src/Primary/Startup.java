package Primary;

public class Startup {
    static int count = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat(3, "Барсик");
        count++;
        barsik.jump();
        barsik.meow();

        CatTimeMachine catTimeMachine = new CatTimeMachine();
        catTimeMachine.goToFutrure(barsik);
        System.out.println("Котику "+ barsik.name + " Стало " + barsik.age + " лет");
        catTimeMachine.goToPast(barsik);
        System.out.println("Котику "+barsik.name + " Стало " + barsik.age + " лет");

        Object obj = new Object();
    }
}
