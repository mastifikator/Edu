import java.util.ArrayList;
import java.util.Random;

public class Test {


    public static void main(String[] args) {
        String test = "";
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        System.out.println(c);
    }
}
