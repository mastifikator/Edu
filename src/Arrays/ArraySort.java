package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {

    //Вывод информации о состоянии массива
    static void infoArray(int[] array){
        System.out.println("Состояние массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    //Обмен элементов в массиве значениями по индексам
    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    //Пузырьковая сортировка, квадратичная сложность O(n^2)
    public static int[] bubbleSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем пузырьковую сортировку");
        long start = System.nanoTime();

        boolean arrayNotSorted = true;

        while (arrayNotSorted) {
            arrayNotSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    arrayNotSorted = true;
                }
            }
        }

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Сортировка выбором, квадратичная сложность O(n^2)
    public static int[] choiceSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем сортировку выбором");
        long start = System.nanoTime();

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Сортировка вставками, квадратичная сложность O(n^2)
    public static int[] insertSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем сортировку вставками");
        long start = System.nanoTime();

        for (int left = 0; left < array.length; left++) {
            int pullValue = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (array[i] > pullValue)
                    array[i + 1] = array[i];
                else
                    break;
            }
            array[i + 1] = pullValue;
        }

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Челночная сортировка, квадратичная сложность O(n^2)
    public static int[] shuttleSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем челночную сортировку");
        long start = System.nanoTime();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1])
                        swap(array, z, z - 1);
                    else break;
                }
            }
        }

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Сортировка методом класса Array встроенной библиотеки
    public static int[] defaultSort(int[] array){
        infoArray(array);

        System.out.println("Выполняем дефолтную Array.sort сортировку");
        long start = System.nanoTime();

        Arrays.sort(array);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Старт
    public static void main(String[] args) {
        int[] array = {4, 76, 3, 66, 99, -99, 1, 0, -5, -2};

        ArraySort.bubbleSort(array);
        System.out.println("");
        ArraySort.choiceSort(array);
        System.out.println("");
        ArraySort.insertSort(array);
        System.out.println("");
        ArraySort.shuttleSort(array);
        System.out.println("");
        ArraySort.defaultSort(array);
    }
}