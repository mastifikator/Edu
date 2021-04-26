import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {


    public static void main(String[] args) {
        int count = 5;

        HashSet<String> hset = new HashSet<>();
        hset.add("saggs");
        hset.add("dfh");
        hset.add("dgjgjgjj");
        hset.add("ttt");
        hset.add("7777");
        Iterator iter = hset.iterator();

        for(int i = 0; i < 5; i++){
            System.out.println(iter.next());
        }

    }
}
