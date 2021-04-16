package Primary;

public class Immutable {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 3;

        b = a;
        a = 2;

        System.out.println(a);
        System.out.println(b);
    }
}
