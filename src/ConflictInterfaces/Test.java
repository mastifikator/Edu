package ConflictInterfaces;

public class Test implements Test1, Test2{
    //если не переопределить то будет ошибка компиляции
    @Override
    public void test() {
        System.out.println("Тест");
    }
}
