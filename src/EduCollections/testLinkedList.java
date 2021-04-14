package EduCollections;

import java.lang.reflect.Array;
import java.util.*;

public class testLinkedList {



    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList("Коля","Оля","Наташа","Игорь","Леша","Вадим","Кирилл","Линда","Эрик","Маша"));


        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

    }

}
