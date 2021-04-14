package Exceptions;

import java.io.IOException;

public class CustomException {

    public static class WarEquipNotReady extends Exception {
        public WarEquipNotReady(String message){
            super(message);
        }
    }

    public static class Warrior{
        public String name;
        public boolean weaponIsEquip, armorIsEquip, brainIsEquip;

        public Warrior(String name){
            this.name = name;
        }

        public void putWeapon(){
            this.weaponIsEquip = true;
            System.out.println("Оружие экипировано");
        }

        public void putArmor(){
            this.armorIsEquip = true;
            System.out.println("Броня экипирована");
        }

        public void putBrain(){
            this.brainIsEquip = true;
            System.out.println("Мозг включен");
        }

        public void goToTheWar() throws WarEquipNotReady{
            if(weaponIsEquip&&armorIsEquip&&brainIsEquip){
                System.out.println("Воин по имени " + name + " отправляется на войну!");
            } else {
                throw new WarEquipNotReady("Воин не экипирован надлежащим образом, вы что хотите его смерти???");
            }
        }

    }

    public static void main(String[] args) throws WarEquipNotReady {
            Warrior antonio = new Warrior("Антоха");
            antonio.putArmor();
            antonio.putWeapon();
            //antonio.putBrain();

            antonio.goToTheWar();

        }

}

