package RegExps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {


    public static void main(String[] args) {
        //считаем кол-во вхождений
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher("helloadsggsdahellosdsdhello");

        int count = 0;
        while(matcher.find()){
            count++;
        }

        System.out.println(count);

    }
}
