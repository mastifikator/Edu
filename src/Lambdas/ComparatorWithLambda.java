package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {

    public static List<String[]> listArray = new ArrayList<>();

    public static String[] list1 = new String[]{"dddddd", "wsrhg", "sdgsgd", "sdgssss"};
    public static String[] list2 = new String[]{"sdghdsgsdggs", "ghhhhhjkhkjkk", "sdgsssdddfds"};
    public static String[] list3 = new String[]{"dddddd", "wsrhfggffffffffffffffffffffffffg"};
    public static String[] list4 = new String[]{"dddfghhfhfddd", "wsgjhhjfrhg", "sdgshghghggd", "sdgsffhfhsss"};
    public static String[] list5 = new String[]{"dddgjjjkddd", "wsfgjfgrhg", "sdfgjjfgsgd", "sdfgjhjfggssss", "sdgsfgjjfsss"};


    public static void main(String[] args) {
        listArray.add(list1);
        listArray.add(list2);
        listArray.add(list3);
        listArray.add(list4);
        listArray.add(list5);

        //сортируем по кол-ву элементов
        listArray.sort((Comparator.comparingInt(o -> o.length)));

        //сортируем по кол-ву букв всех элементов
        listArray.sort((o1, o2) -> {
            int count1 = 0, count2 = 0;
            for (String s1 : o1) {
                count1 += s1.length();
            }
            for (String s2 : o2){
                count2 += s2.length();
            }
            return count1 - count2;
        });

        for (String[] array : listArray) {
            System.out.println(array);
            for (String i : array) {
                System.out.println(i);
            }

        }
    }
}
