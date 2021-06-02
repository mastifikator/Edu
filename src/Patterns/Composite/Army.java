package Patterns.Composite;

import java.util.ArrayList;

public class Army implements IMilitary{

    private int strength = 0;
    private String name ="";
    ArrayList<Squad> squads = new ArrayList<>();

    public Army(String name) {
        this.name = name;
    }

    public Army() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Squad> getSquads() {
        return squads;
    }

    public boolean addSquad(Squad squad){
        return squads.add(squad);
    }


    @Override
    public int getPower() {
        for(Squad s : squads){
            strength += s.getPower();
        }

        return strength;
    }
}
