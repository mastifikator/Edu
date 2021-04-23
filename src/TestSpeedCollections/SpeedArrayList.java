package TestSpeedCollections;

import java.util.*;

public class SpeedArrayList {

    private ArrayList<Integer> intArray;
    private ArrayList<String> stringArray;
    private ArrayList<Date> dateArray;
    private final String COLLECTION_TYPE = "ArrayList";
    private String typeVariable;
    public int startElements = 0;
    private String nameOperation;
    public String outPrint = "В %s было %d элементов %s, %s %d, осталось %d, заняло %o нс \n";

    public SpeedArrayList(ArrayList<?> array) {
        if (array.get(0) instanceof Integer) {
            this.intArray = (ArrayList<Integer>) array;
            this.typeVariable = "Integer";
        } else if (array.get(0) instanceof String) {
            this.stringArray = (ArrayList<String>) array;
            this.typeVariable = "String";
        } else if (array.get(0) instanceof Date) {
            this.dateArray = (ArrayList<Date>) array;
            this.typeVariable = "Date";
        }else{
            throw new IllegalArgumentException("Введен не поддерживаемый Generic у ArrayList");
        }
    }

    public void testArrayListAdd(int countOperationsAdd) {

        System.out.println("\nТестируем скорость операций добавления элементов в ArrayList");
        System.out.println("--------------------------------------------------");

        long start, finish;
        nameOperation = "добавлено";


        if (intArray != null) {
            //Если поступил массив Integer
            AddIntToCollection.AddToBegin(countOperationsAdd, intArray, COLLECTION_TYPE);
            AddIntToCollection.AddToEnd(countOperationsAdd, intArray, COLLECTION_TYPE);
            AddIntToCollection.AddToMiddle(countOperationsAdd, intArray, COLLECTION_TYPE);
        } else if (stringArray != null) {
            //Если поступил массив String
            AddStringToCollection.AddToBegin(countOperationsAdd, stringArray, COLLECTION_TYPE);
            AddStringToCollection.AddToEnd(countOperationsAdd, stringArray, COLLECTION_TYPE);
            AddStringToCollection.AddToMiddle(countOperationsAdd, stringArray, COLLECTION_TYPE);
            //Если поступил массив Date
        } else if (dateArray != null) {
            AddDateToCollection.AddToBegin(countOperationsAdd, dateArray, COLLECTION_TYPE);
            AddDateToCollection.AddToEnd(countOperationsAdd, dateArray, COLLECTION_TYPE);
            AddDateToCollection.AddToMiddle(countOperationsAdd, dateArray, COLLECTION_TYPE);
        }
    }

    public void testArrayListGet(int countOperationsGet) {
        System.out.println("\nТестируем скорость операции получения элементов из ArrayList");
        System.out.println("--------------------------------------------------");

        nameOperation = "получено";
        long start, finish;

        if (intArray != null) {
            ArrayList<Integer> arrayList = intArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            for (int i = 0; i < countOperationsGet; i++) {
                arrayList.get(i);
            }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, arrayList.size(), finish - start);

        } else if (stringArray != null) {
            ArrayList<String> arrayList = stringArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            for (int i = 0; i < countOperationsGet; i++) {
                arrayList.get(i);
            }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, arrayList.size(), finish - start);

        } else if (dateArray != null) {
            ArrayList<Date> arrayList = dateArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            for (int i = 0; i < countOperationsGet; i++) {
                arrayList.get(i);
            }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsGet, arrayList.size(), finish - start);
        }
    }

    public void testArrayListRemove(int countOperationsRemove) {
        System.out.println("\nТестируем скорость удаления элементов из ArrayList");
        System.out.println("--------------------------------------------------");
        nameOperation = "удалено";

        long start, finish;

        //Если поступил массив Integer
        if (intArray != null) {
            ArrayList<Integer> arrayList = intArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            int delCount = countOperationsRemove;
            for (Iterator<Integer> i = arrayList.iterator(); i.hasNext() && delCount > 0; delCount--) {
                i.next();
                i.remove();
            }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, arrayList.size(), finish - start);
        } else if (stringArray != null) {
            ArrayList<String> arrayList = stringArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            int delCount = countOperationsRemove;
            for (Iterator<String> i = arrayList.iterator(); i.hasNext() && delCount > 0; delCount--) {
                i.next();
                i.remove();
            }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, arrayList.size(), finish - start);
        } else if (dateArray != null) {
            ArrayList<Date> arrayList = dateArray;
            startElements = arrayList.size();

            start = System.nanoTime();
            int delCount = countOperationsRemove;
                for (Iterator<Date> i = arrayList.iterator(); i.hasNext() && delCount > 0; delCount--) {
                    i.next();
                    i.remove();
                }
            finish = System.nanoTime();

            System.out.printf(outPrint, COLLECTION_TYPE, startElements, typeVariable, nameOperation, countOperationsRemove, arrayList.size(), finish - start);
        }

    }


}
