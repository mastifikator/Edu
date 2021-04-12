package Tests;

public class Jarvis {
    public void sayHi (String...names){
        for(String name: names){
            System.out.println("Здравствуйте " + name);
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Тони Старк", "Черная вдова", "Капитан Америка", "Халк");
    }
}
