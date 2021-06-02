package Patterns.Composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создаем армию
        Army army1 = new Army();
        Army army2 = new Army();
        Army army3 = new Army();

        for (int i = 1; i <= 10; i++) {
            army1.addSquad(new Squad());
            army2.addSquad(new Squad());
            army3.addSquad(new Squad());
        }

        for (Squad squad : army1.squads){
            for (int i = 1; i <= 10; i++) {
                squad.addSoldier(new Soldier(String.valueOf(i)));
            }
        }

        for (Squad squad : army2.squads){
            for (int i = 1; i <= 11; i++) {
                squad.addSoldier(new Soldier(String.valueOf(i)));
            }
        }

        for (Squad squad : army3.squads){
            for (int i = 1; i <= 12; i++) {
                squad.addSoldier(new Soldier(String.valueOf(i)));
            }
        }

        //Магия компоновщика позволяет обращаться к разным классам как к одному получая необходимые данные за счет общего интерфейса
        ArrayList<IMilitary> iMilitaries = new ArrayList<>();
        iMilitaries.add(army1);
        iMilitaries.add(army2.squads.get(3));
        iMilitaries.add(army3.squads.get(5));
        iMilitaries.add(new Soldier("Боря"));
        iMilitaries.add(new Soldier("Коля"));
        iMilitaries.add(new Soldier("Саша"));
        iMilitaries.add(new MilitaryEquipment("Гранаты"));
        iMilitaries.add(new MilitaryEquipment("Экипировка"));

        for(IMilitary iMilitary : iMilitaries){
            System.out.println(iMilitary.getPower());
        }
    }
}
