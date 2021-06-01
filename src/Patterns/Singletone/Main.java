package Patterns.Singletone;

public class Main {
    public static void main(String[] args) {
        Unit unit1 = Unit.getInstance("орк","Скаут", "Социальный");
        Unit unit2 = Unit.getInstance("орк","Скаут", "Социальный");

        System.out.println(unit1.toString());
        System.out.println(unit2.toString());

        unit2.setName("Одиночка");

        System.out.println(unit1.toString());
        System.out.println(unit2.toString());
    }
}
