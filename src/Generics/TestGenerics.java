package Generics;

public class TestGenerics<T extends Number> {

    private T some;

    public TestGenerics(T some){
        this.some = some;
    }

    public <T> T someMethod(T clazz){
        System.out.println(clazz);
        System.out.println(some);
        return clazz;
    }

    public static void main(String[] args) {
        Integer i = 8;
        String s = "Hello";

        TestGenerics test = new TestGenerics(i);

        test.someMethod(i);
        test.someMethod(s);
    }
}
