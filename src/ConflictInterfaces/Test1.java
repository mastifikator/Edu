package ConflictInterfaces;

public interface Test1 {
    default void test(){
        System.out.println("Тест1");
    }
}
