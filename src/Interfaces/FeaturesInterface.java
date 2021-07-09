package Interfaces;

interface ITest {
    static void giveMeTest() {
        System.out.println("Я статический метод интерфейса");
    }

    public abstract void giveMeAbstract();

    default void giveMeDefault() {
        System.out.println("Я дефолтный метод!");
    }
}

interface ITest2 {
    static void giveMeTest() {
        System.out.println("Я статический метод интерфейса");
    }

    public abstract void giveMeAbstract();

//    default void giveMeDefault(){
//        System.out.println("Я дефолтный метод!");
//    }
}


public class FeaturesInterface implements ITest, ITest2 {

    @Override
    public void giveMeAbstract() {
        System.out.println("Я абстрактный метод!");
    }

    static void giveMeTest() {
        System.out.println("Я статический метод ласса Test");
    }

    public static synchronized void main(String[] args) {

        ITest.giveMeTest();

        ITest test = new FeaturesInterface();
        test.giveMeDefault();

        test.giveMeAbstract();
    }
}
