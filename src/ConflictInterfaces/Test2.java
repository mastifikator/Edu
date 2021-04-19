package ConflictInterfaces;

public interface Test2 {
    default void test(){
        System.out.println("Тест2");
    }
}
