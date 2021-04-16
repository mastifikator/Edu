package Primary;

public class CatCollector {

    public static void main(String[] args) {
        //Сборщик начинает отрабатывать после 31600 объектов
        for(int i = 0; i < 31700; i++){
            Cat cat = new Cat(i);
            cat = null;
            System.out.println("Рождено котов: " + Cat.createCount);
            System.out.println("Уничтожено котов: " + Cat.destroyCount);
        }

    }
}
