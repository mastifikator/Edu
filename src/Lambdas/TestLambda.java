package Lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestLambda {

    //Функциональный интерфейс приниматель решений
    interface SolverHelper{
        Boolean solve(int age);
    }

    public static void someMethod(String inputString, int age, SolverHelper solution){
        if(solution.solve(age)){
            System.out.println("Показываю строку:");
            System.out.println(inputString);
        }else{
            System.out.println("В показе отказано, решатель запретил");
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите возраст:");
        Scanner in = new Scanner(System.in);
        int age = Integer.parseInt(in.nextLine());

        someMethod("Жопа", age, s -> s >= age);
    }
}
