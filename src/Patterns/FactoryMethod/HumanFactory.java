package Patterns.FactoryMethod;

public class HumanFactory extends UnitFactory {
    public Human createUnit(){
        System.out.println("Человеку выдана броня");
        return new Human();
    }
}
