package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    private int[] array;

    //Вывод информации о состоянии массива
    static void infoArray(int[] array) {
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
        System.out.println("Прошло времени, нс: " + elapsed);

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
        System.out.println("Прошло времени, нс: " + elapsed);

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

    //Сложная сортировка слиянием, логарифмическая сложность O(n log n)
    //Метод обертка для рекурсивного метода
    /*public static int[] mergeSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем сортировку слиянием");
        long start = System.nanoTime();

        mergeSeparation(array, 0, array.length - 1);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        infoArray(array);

        return array;
    }

    //Рекурсивный метод сортировки слиянием для разбивки массива "Разделяй и властвуй"
    public static void mergeSeparation(int[] array, int left, int right) {
        //базовый случай
        if (left < right) {
            int delimiter = (left + right) / 2;
            //рекурсивно разделяем массивы на подмассивы
            mergeSeparation(array, left, delimiter);
            mergeSeparation(array, delimiter + 1, right);
            //сортируем и соединяем массивы в один
            mergeAndSort(array, left, delimiter, right);
        }
    }

    //Метод для выполнения слияния в сортировке слиянием
    private static void mergeAndSort(int[] array, int left, int delimiter, int right) {
        //Вычисляем длину
        int lengthLeft = delimiter - left + 1;
        int lengthRight = right - delimiter;

        //создаем временные подмассивы
        int[] leftArray = new int[lengthLeft + 1];
        int[] rightArray = new int[lengthRight + 1];

        //копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < lengthRight; j++)
            rightArray[j] = array[delimiter + j + 1];

        //итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int k = left; k <= right; k++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[k] = leftArray[leftIndex];
                leftIndex++;
            }else{
                array[k] = rightArray[rightIndex];
                rightIndex++;
            }
        }

    }
    */

    //Быстрая сортировка, логарифмическая сложность O(n log n)
    //Метод обертка для быстрой сортировки
    public static int[] quickSort(int[] array) {
        infoArray(array);

        System.out.println("Выполняем быструю сортировку");
        long start = System.nanoTime();

        quick(array, 0, array.length - 1);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        infoArray(array);

        return array;
    }

    //сама рекурсивная быстрая сортировка
    private static void quick(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quick(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quick(source, leftBorder, rightMarker);
        }
    }

    //Сортировка методом класса Array встроенной библиотеки
    public static int[] defaultSort(int[] array) {
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
        //Задаем величину массива
        int lengthArray = 10;
        int[] bigArray = new int[lengthArray];
        Random random = new Random();

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = random.nextInt(100);
        }

        int[] array1 = new int[lengthArray], array2 = new int[lengthArray], array3 = new int[lengthArray],
                array4 = new int[lengthArray], array5 = new int[lengthArray], array6 = new int[lengthArray] ;
        System.arraycopy(bigArray, 0, array1, 0, lengthArray);
        System.arraycopy(bigArray, 0, array2, 0, lengthArray);
        System.arraycopy(bigArray, 0, array3, 0, lengthArray);
        System.arraycopy(bigArray, 0, array4, 0, lengthArray);
        System.arraycopy(bigArray, 0, array5, 0, lengthArray);
        System.arraycopy(bigArray, 0, array6, 0, lengthArray);

        ArraySort.bubbleSort(array1);
        System.out.println("");

        ArraySort.choiceSort(array2);
        System.out.println("");

        ArraySort.insertSort(array3);
        System.out.println("");

        ArraySort.shuttleSort(array4);
        System.out.println("");

        ArraySort.quickSort(array5);
        System.out.println("");

        ArraySort.defaultSort(array6);
        System.out.println("");

    }
}