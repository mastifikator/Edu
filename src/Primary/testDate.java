package Primary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testDate {
    public static void main (String[] args) throws Throwable {

        //Date устарел говорят
        /*for(int i = 0; i < 5; i ++) {
            Date date = new Date();
            System.out.println(date.getSeconds());
            Thread.sleep(1000);
        }*/

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.ERA, GregorianCalendar.BC);
        calendar.set(Calendar.YEAR, 8000);
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");

        //Хочу к динозаврам минус не пашет...!
        System.out.println(df.format(calendar.getTime()));


        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
        System.out.println("Порядковый номер недели в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));//порядковый номер недели в месяце

        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
        System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
        System.out.println("Миллисекунды: " + calendar.get(Calendar.MILLISECOND));
    }
}
