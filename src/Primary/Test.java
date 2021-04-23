package Primary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
        public static void main(String[] args) {

            int x = 7;
            incrementNumber(x);
            System.out.println(x);

            Cat cat = new Cat(7);
            catLevelUp(cat);
            System.out.println(cat.getAge());


        }


        public static void catLevelUp(Cat cat) {

            cat.setAge(cat.getAge()+1);
        }

        public static void incrementNumber(int x) {
            x++;
    }
}
