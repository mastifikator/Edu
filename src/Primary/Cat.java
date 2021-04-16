package Primary;

public class Cat {
    int age;
    String name;
    static int destroyCount;
    static int createCount;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Cat (int age){
        this.age = age;
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
