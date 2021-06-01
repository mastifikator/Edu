package EduCollections.Randomizer;
import java.util.*;

public class RandomArrayListGenerator {

    private ArrayList list;

    public ArrayList getList() {
        return list;
    }

    //Конструктор для передачи типа переменных в виде текстовой строки
    public RandomArrayListGenerator(String parameter, int count, boolean parameterAsString) {

        switch (parameter) {
            case ("Integer") : this.list = giveMeInteger(count); break;
            case ("Float") : this.list = giveMeFloat(count); break;
            case ("Long") : this.list = giveMeLong(count); break;
            case ("Double") : this.list = giveMeDouble(count); break;
            case ("String") : this.list = giveMeString(count); break;
            case ("Character") : this.list = giveMeChar(count); break;
            case ("Boolean") : this.list = giveMeBoolean(count); break;
            case ("Byte") : this.list = giveMeByte(count); break;
            case ("Date") : this.list = giveMeDate(count); break;
            case ("TestObject") : this.list = giveMeTestObject(count); break;
            default : throw new IllegalArgumentException("Введен неизвестный Рандомайзеру Класс");
        }
    }

    //Получаем на вход какой-то тип переменной и колличество в ответ получаем ArrayList
    public RandomArrayListGenerator(Integer integer, int count) {
        this.list = giveMeInteger(count);
    }

    public RandomArrayListGenerator(Float flo, int count) {
        this.list = giveMeFloat(count);
    }

    public RandomArrayListGenerator(Long lon, int count) {
        this.list = giveMeLong(count);
    }

    public RandomArrayListGenerator(Double dou, int count) {
        this.list = giveMeDouble(count);
    }

    public RandomArrayListGenerator(String str, int count) {
        this.list = giveMeString(count);
    }

    public RandomArrayListGenerator(Character cha, int count) {
        this.list = giveMeChar(count);
    }

    public RandomArrayListGenerator(Boolean boo, int count) {
        this.list = giveMeBoolean(count);
    }

    public RandomArrayListGenerator(Byte by, int count) {
        this.list = giveMeByte(count);
    }

    public RandomArrayListGenerator(Date date, int count) {
        this.list = giveMeDate(count);
    }

    public RandomArrayListGenerator(TestObject obj, int count) {
        this.list = giveMeTestObject(count);
    }

    //Имеем возможность формировать ArrayList без создания экземпляров класса
    public static ArrayList<Integer> giveMeInteger(int count){
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextInt());
        }

        return result;
    }

    public static ArrayList<Float> giveMeFloat(int count){
        Random random = new Random();
        ArrayList<Float> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextFloat());
        }

        return result;
    }

    public static ArrayList<Long> giveMeLong(int count){
        Random random = new Random();
        ArrayList<Long> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextLong());
        }

        return result;
    }

    public static ArrayList<Double> giveMeDouble(int count){
        Random random = new Random();
        ArrayList<Double> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextDouble());
        }

        return result;
    }

    public static ArrayList<String> giveMeString(int count){
        Random random = new Random();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < count; i++ ) {
            StringBuffer text = new StringBuffer();
            while(text.length() < 5){
                text.append(Integer.toHexString(random.nextInt()));
            }
            result.add(text.toString());
        }

        return result;
    }

    public static ArrayList<Character> giveMeChar(int count){
        Random random = new Random();
        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i < count; i++ ) {
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            result.add(c);
        }

        return result;
    }

    public static ArrayList<Boolean> giveMeBoolean(int count){
        Random random = new Random();
        ArrayList<Boolean> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            result.add(random.nextBoolean());
        }

        return result;
    }

    public static ArrayList<Byte> giveMeByte(int count){
        Random random = new Random();
        ArrayList<Byte> result = new ArrayList<>();

        for(int i = 0; i < count; i++){
            StringBuffer text = new StringBuffer();
            while(text.length() < 5){
                text.append(Integer.toHexString(random.nextInt()));
            }
            result.add(Byte.parseByte(text.toString()));
        }

        return result;
    }

    public static ArrayList<Date> giveMeDate(int count){
        ArrayList<Date> result = new ArrayList<>();
        Calendar calendar = new GregorianCalendar(2021, 4, 23);

        for (int i = 0; i < count; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            calendar.add(Calendar.HOUR, -1);
            Date date = calendar.getTime();

            result.add(date);
        }

        return result;
    }

    public static ArrayList<TestObject> giveMeTestObject(int count){
        ArrayList<TestObject> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            result.add(new TestObject());
        }

        return result;
    }
}