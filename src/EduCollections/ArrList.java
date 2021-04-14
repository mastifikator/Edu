package EduCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrList {

    //Вводим лист с клавиатуры пок не буддет введено пустое значение и выводим результирующий массив
    public static ArrayList<String> consoleCompletion() throws IOException{
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("")) break;
            list.add(s);
        }

        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println("");
        return list;
    }

    //Удаляем нечетные и выводим результирующий массив
    public static ArrayList<Integer> deleteOdd(ArrayList<Integer> list){

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i%2 != 0) iterator.remove();
        }

        for(Integer i : list){
            System.out.print(i + " ");
        }

        return list;
    }

    //Удаляем четные и выводим результирующий массив
    public static ArrayList<Integer> deleteEven(ArrayList<Integer> list){

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i%2 == 0) iterator.remove();
        }

        for(Integer i : list){
            System.out.print(i + " ");
        }

        return list;
    }

    public static void main(String[] args) throws IOException {

        try {
            ArrayList<String> listString = consoleCompletion();

            ArrayList<Integer> listInt = new ArrayList<Integer>();
            for (int i = 0; i < listString.size(); i++) {
                listInt.add(Integer.parseInt(listString.get(i)));
            }

            deleteOdd(listInt);

        }catch(NumberFormatException n) {
            System.out.println("В массиве обнаружены строки, невозможно преобразовать в числа");
        }

    }
}
