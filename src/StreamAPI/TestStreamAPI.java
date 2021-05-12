package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStreamAPI {
    public static void main(String[] args) {
        List<Orc> orcList = new ArrayList<>();
        orcList.add(new Orc("Кирилл", 5, 12));
        orcList.add(new Orc("Антон", 23, 2));
        orcList.add(new Orc("Коля", 2, 5));
        orcList.add(new Orc("Игорь", 1, 7));
        orcList.add(new Orc("Федор", 9, 15));
        orcList.add(new Orc("Михаил", 2, 18));
        orcList.add(new Orc("Андрей", 34, 9));
        orcList.add(new Orc("Женя", 12, 22));
        orcList.add(new Orc("Леша", 7, 9));

        orcList.stream()
                .filter(o -> o.getStrength() > 10)
                .sorted((Comparator.comparing(Orc::getName)))
                .forEach(o -> System.out.println(o));
    }
}
