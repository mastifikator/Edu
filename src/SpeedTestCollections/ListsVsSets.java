package SpeedTestCollections;

import java.util.*;

public class ListsVsSets {

    private Integer[] intArray = null;
    private String[] stringArray = null;
    private ArrayList<Date> listDate = null;

    public ListsVsSets(Integer[] intArray){
        this.intArray = intArray;
    }

    public ListsVsSets(String[] stringArray){
        this.stringArray =stringArray;
    }

    public ListsVsSets(ArrayList<Date> listObject){
        this.listDate = listObject;
    }

    public void testArrayList(int countOperations){

        System.out.println("Тестируем скорость операций ArrayList");
        System.out.println("--------------------------------------");

        //Добавление в конец
        if(intArray != null){
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));
            ArrayList<Integer> randomArray = RandomArrayListGenerator.giveMeIntList(countOperations);

            long start = System.nanoTime();
            for(int i = 0; i < countOperations; i++){
                arrayList.add(randomArray.get(i));
            }
            long finish = System.nanoTime();

            long elapsed = finish - start;
            System.out.printf("Добавление в конец %d элементов Integer заняло %o нс \n", countOperations, elapsed );

            start = System.nanoTime();
            int delCount = countOperations;
            while (delCount > 0)
            for(Iterator<Integer> i = arrayList.iterator(); i.hasNext();){
                i.next();
                i.remove();
                delCount--;
            }
            finish = System.nanoTime();

            elapsed = finish - start;

            System.out.printf("Удаление %d элементов Integer заняло %o нс \n \n", countOperations, elapsed );

        }else if (stringArray != null){
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
            ArrayList<String> randomArray = RandomArrayListGenerator.giveMeStringList(countOperations);

            long start = System.nanoTime();
            for(int i = 0; i < countOperations; i++){
                arrayList.add(randomArray.get(i));
            }
            long finish = System.nanoTime();

            long elapsed = finish - start;
            System.out.printf("Добавление в конец %d элементов String заняло %o нс \n", countOperations, elapsed );

            start = System.nanoTime();
            int delCount = countOperations;
            while (delCount > 0)
                for(Iterator<String> i = arrayList.iterator(); i.hasNext();){
                    i.next();
                    i.remove();
                    delCount--;
                }
            finish = System.nanoTime();

            elapsed = finish - start;

            System.out.printf("Удаление %d элементов String заняло %o нс \n \n", countOperations, elapsed );

        }else if (listDate != null){
            ArrayList<Date> arrayList = listDate;
            ArrayList<Date> randomArray = RandomArrayListGenerator.giveMeDateList(countOperations);

            long start = System.nanoTime();
            for(int i = 0; i < countOperations; i++){
                arrayList.add(randomArray.get(i));
            }
            long finish = System.nanoTime();

            long elapsed = finish - start;
            System.out.printf("Добавление в конец %d элементов Date заняло %o нс \n", countOperations, elapsed );

            start = System.nanoTime();
            int delCount = countOperations;
            while (delCount > 0)
                for(Iterator<Date> i = arrayList.iterator(); i.hasNext();){
                    i.next();
                    i.remove();
                    delCount--;
                }
            finish = System.nanoTime();

            elapsed = finish - start;

            System.out.printf("Удаление %d элементов Date заняло %o нс \n \n", countOperations, elapsed );
        }

    }




}
