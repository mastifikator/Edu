package ComparableVsComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Leonid", 5, 12);
        Human human2 = new Human("Bob", 5, 12);
        Human human3 = new Human("Bill", 5, 9);
        Human human4 = new Human("Mark", 15, 23);
        Human human5 = new Human("Tonny", 6, 4);

        List<Human> humanList = new ArrayList<>();
        Comparator humanStrengthComparator = new HumanStrengthComparator();
        Set<Human> humanSet = new TreeSet<>(humanStrengthComparator.thenComparing(new HumanSpeedComparator().thenComparing(new HumanNameComparator())));

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);
        humanList.sort(humanStrengthComparator);

        humanSet.add(human1);
        humanSet.add(human2);
        humanSet.add(human3);
        humanSet.add(human4);
        humanSet.add(human5);

        Orc orc1 = new Orc("Boris", 7, 5);
        Orc orc2 = new Orc("Fedor", 12, 3);
        Orc orc3 = new Orc("Nikolai", 5, 7);
        Orc orc4 = new Orc("Semen", 1, 2);
        Orc orc5 = new Orc("Oleg", 8, 15);

        List<Orc> orcList = new ArrayList<>();
        Set<Orc> orcSet = new TreeSet<>();

        orcList.add(orc1);
        orcList.add(orc2);
        orcList.add(orc3);
        orcList.add(orc4);
        orcList.add(orc5);
        orcList.sort(Orc::compareTo);

        orcSet.add(orc1);
        orcSet.add(orc2);
        orcSet.add(orc3);
        orcSet.add(orc4);
        orcSet.add(orc5);

        System.out.println("Выводим List орков " + orcList.size());
        for (Orc orc : orcList){
            System.out.println(orc.toString());
        }


        System.out.println("Выводим List людей " + humanList.size());
        for (Human human : humanList){
            System.out.println(human.toString());
        }

        System.out.println("Выводим Set орков " + orcList.size());
        for (Orc orc : orcSet){
            System.out.println(orc.toString());
        }

        System.out.println("Выводим Set людей " + humanSet.size());
        for (Human human : humanSet){
            System.out.println(human.toString());
        }

        Comparator humanOrcMapComparator = new HumanOrcMapComparator();
        Map<Human, Orc> orcHumanMap = new TreeMap<>(humanOrcMapComparator);
        orcHumanMap.put(human1, orc1);
        orcHumanMap.put(human2, orc2);
        orcHumanMap.put(human3, orc3);
        orcHumanMap.put(human4, orc4);
        orcHumanMap.put(human5, orc5);


        System.out.println("Выводим Map людей и орков " + orcList.size());
        for (Map.Entry<Human, Orc> entry : orcHumanMap.entrySet()){
            System.out.println("key:" + entry.getKey() + "\n" + "value:" + entry.getValue());
        }


    }
}
