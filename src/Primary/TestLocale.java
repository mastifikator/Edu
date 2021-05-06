package Primary;

import java.util.Locale;

public class TestLocale {

    public static void main(String[] args) {
        Locale ca = Locale.CANADA;
        Locale current = Locale.getDefault();

        System.out.println(ca.getCountry());
        System.out.println(ca.getDisplayCountry());
        System.out.println(ca.getLanguage());
        System.out.println(ca.getDisplayScript());
        System.out.println(ca.getISO3Country());
        System.out.println(ca.getDisplayVariant());
        System.out.println(ca.getUnicodeLocaleKeys());


    }



}
