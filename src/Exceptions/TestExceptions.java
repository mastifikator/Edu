package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestExceptions {

    public static void arithmeticEx(){
        int a = 1, b = 0;
        int c = a/b;
    }

    public static void arrayIndexofBoundEx(){
        int[] arr = new int[]{1,2,3};
        int c = arr[5];
    }

    public static void nullPointerEx(){
        ((Object) null).toString();
    }

    public static void ioEx() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(""));
    }

    public static void throwEx() throws  IllegalAccessException{
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try{
            //unchecked
            //TestExceptions.arithmeticEx();
            //TestExceptions.arrayIndexofBoundEx();
            //TestExceptions.nullPointerEx();
            //checked
            TestExceptions.throwEx();
            TestExceptions.ioEx();

        }catch (ArithmeticException a){
            System.out.println("Обнаружена арифметическая ошибка");
            //a.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println("Обнаружена ошибка выхода за пределы массива");
            i.printStackTrace();
        }catch (NullPointerException p){
            System.out.println("Обнаружена ошибка обращения к пустой ссылке");
            p.printStackTrace();
        }catch (IOException i){
            System.out.println("Обнаружена ошибка ввода/вывода");
            i.printStackTrace();
        }catch (Throwable t){
            System.out.println("Обнаружена неизвестная ошибка");
            t.printStackTrace();
        }finally {
            System.out.println("Работа программы продолжается");
        }

        System.out.println("Выполняем дальнейшие действия");
    }
}
