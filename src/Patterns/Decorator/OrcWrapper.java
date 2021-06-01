package Patterns.Decorator;

public class OrcWrapper extends Orc{

    private Orc orcOriginal;

    public OrcWrapper(Orc orc) {

        super(orc.getName());
        this.orcOriginal = orc;
    }

    @Override
    public String getName() {
        return orcOriginal.getName() + " из обертки";
    }

    @Override
    public void setName(String name) {
        orcOriginal.setName(name);
    }

    @Override
    public int getPower() {
        return orcOriginal.getPower() + 3;
    }

    @Override
    public void setPower(int power) {
        orcOriginal.setPower(power);
    }

    @Override
    public int getSpeed() {
        return orcOriginal.getSpeed() + 3;
    }

    @Override
    public void setSpeed(int speed) {
        orcOriginal.setSpeed(speed);
    }
}
