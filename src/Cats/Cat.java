package Cats;

public class Cat {
    int age;
    String name;
    static int destroyCount;
    static int createCount;

    public Cat (int age, String name){
        this.age = age;
        this.name = name;
        createCount++;
        System.out.println("Создан котик " + age + " годиков с именем " + name);
    }

    protected void finalize() throws Throwable{
        System.out.println("Кот уничтожен!");
        destroyCount++;
    }

    public void meow (){
        System.out.println("Meoowww!");
    }
    public void jump (){
        System.out.println("Прыг-скок");
    }
}
