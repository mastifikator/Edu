package Cats;

public class Recursion {

    //Вычисление факториала с помощью рекурсии
    public static int recursionFactorial(int n){

        if(n == 1)return 1;

        // Шаг рекурсии / рекурсивное условие
       return recursionFactorial(n-1)*n;
    }



    //Вычисление суммы с помощью рекурсии
    public static  int recursionSum(int n){

        if(n==1)return 1;

        // Шаг рекурсии / рекурсивное условие
        return recursionSum(n-1)+n;
    }

    public static String allNumeric(int n){

        if (n==1) return "1";

        return allNumeric(n-1) + " " + n;
    }


    public static void main(String[] args) {

        System.out.println(Recursion.recursionSum(4));
        System.out.println(Recursion.recursionFactorial(4));
        System.out.println(Recursion.allNumeric(12));
    }
}
