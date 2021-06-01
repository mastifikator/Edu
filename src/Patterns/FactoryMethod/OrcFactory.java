package Patterns.FactoryMethod;

public class OrcFactory extends UnitFactory {
    public Orc createUnit(){
        System.out.println("Орку выдан топор");
        return new Orc();
    }
}
