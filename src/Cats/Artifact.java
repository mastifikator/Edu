package Cats;

public class Artifact {
    private int serialNumber;
    private String culture;
    private int century;

    public Artifact(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public Artifact(int serialNumber, String culture){
        this.serialNumber = serialNumber;
        this.culture = culture;
    }

    public Artifact(int serialNumber, String culture, int century){
        this.serialNumber = serialNumber;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(1);
        Artifact artifact2 = new Artifact(2, "Ацтеки");
        Artifact artifact3 = new Artifact(3, "Инки", 9);
    }
}
