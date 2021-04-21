package Decorator;

public class Startup {

    public static void main(String[] args) {
        {
            Orc orc = new Orc("Боря");
            OrcWrapper orcWrap = new OrcWrapper(orc);

            printOrcProperties(orc);
            printOrcProperties(orcWrap);
        }
    }

    public static void printOrcProperties(Orc orc){
        System.out.println(orc.getName());
        System.out.println(orc.getPower());
        System.out.println(orc.getSpeed());
    }
}
