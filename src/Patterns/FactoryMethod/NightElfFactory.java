package Patterns.FactoryMethod;

public class NightElfFactory extends UnitFactory {
    public NightElf createUnit(){
        System.out.println("Тёмному эльфу выдан лук, модный");
        return new NightElf();
    }
}
