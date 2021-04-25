package TestListCollections;

import java.util.*;

public class RandomArrayListGenerator {
    public static ArrayList<Integer> giveMeIntList (int count){
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextInt());
        }

        return result;
    }

    public static ArrayList<String> giveMeStringList (int count){
        Random random = new Random();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < count; i++ ) {
            StringBuffer text = new StringBuffer();
            while(text.length() < 5){
                text.append(Integer.toHexString(random.nextInt()));
            }
            result.add(text.toString());
        }

        return result;
    }

    public static ArrayList<Date> giveMeDateList (int count){
        ArrayList<Date> result = new ArrayList<>();
        Calendar calendar = new GregorianCalendar(2021, 4, 23);

        for (int i = 0; i < count; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            calendar.add(Calendar.HOUR, -1);
            Date date = calendar.getTime();

            result.add(date);
        }

        return result;
    }


}
