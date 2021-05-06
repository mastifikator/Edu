package CloneableTest;

public class Main {

    public static void main(String[] args) {
        Orc orc1 = new Orc("Борис", 5, 7);
        Orc orc2 = null;
        try{
            orc2 = orc1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("До изменения");
        System.out.println(orc1);
        System.out.println(orc2);

        orc1.setName("Николай");
        orc1.setStrength(20);
        orc1.weapon.setName("Меч");

        System.out.println("После изменения");
        System.out.println(orc1);
        System.out.println(orc2);

    }
}
