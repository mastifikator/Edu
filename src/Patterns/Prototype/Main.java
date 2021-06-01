package Patterns.Prototype;

public class Main {
    public static void main(String[] args) throws Exception{
        Unit unitOriginal = new Unit("Кентавр", "рабак", "Петя");
        Unit unitClone = (Unit)unitOriginal.clone();
        unitClone.setName("КлонПети");

        System.out.println(unitOriginal.toString());
        System.out.println(unitClone.toString());
    }
}
