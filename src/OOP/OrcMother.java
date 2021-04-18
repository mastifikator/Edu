package OOP;

public class OrcMother {


    public OrcMother(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public void orcLove (OrcFather in){

        if (in instanceof OrcOgr){
            System.out.println("Извини, я не готова");
        }else{
            System.out.println("Привет красавчик!");
            in.battleRoar("Я долго к тебе шел!");
            in.waaagh = true;
            in.run();
        }

    }

    public static void main(String[] args) {
        OrcMother Kras = new OrcMother("Красавка");

        OrcRaider raid = new OrcRaider("Райдер", 32);
        OrcBugai bugai = new OrcBugai("Бугай", 28);
        OrcOgr ogr = new OrcOgr("Огр", 35);

        //А вот тут полиморфизм
        Kras.orcLove(raid);
        Kras.orcLove(bugai);
        Kras.orcLove(ogr);

    }
}
