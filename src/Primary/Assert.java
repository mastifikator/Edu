package Primary;

public class Assert {
    public static void main(String[] args) {
        //Нужно указывать включение проверки утверждения при запуске java параметром Java -ea
        int value = 15;
        assert value >=20: "Underweight";
        System.out.println("value is: " + value);
    }
}
