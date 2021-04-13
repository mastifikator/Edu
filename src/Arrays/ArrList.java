package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrList {

    //Вводим лист с клавиатуры
    public static ArrayList<String> consoleCompletion() throws IOException{
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("end")) break;
            list.add(s);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        return list;
    }

    //Удаляем нечетные
    public static ArrayList<Integer> deleteOdd(ArrayList<Integer> list){

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2 == 1){
                list.remove(i);
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> listInt =

        deleteOdd();

    }
}
