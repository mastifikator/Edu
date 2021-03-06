import javax.sql.rowset.RowSetProvider;
import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

interface ITest {
    static void giveMeTest(){
        System.out.println("Я статический метод интерфейса");
    }

    public abstract void giveMeAbstract();

    default void giveMeDefault(){
        System.out.println("Я дефолтный метод!");
    }
}

interface ITest2 {
    static void giveMeTest(){
        System.out.println("Я статический метод интерфейса");
    }

    public abstract void giveMeAbstract();

//    default void giveMeDefault(){
//        System.out.println("Я дефолтный метод!");
//    }
}


public class Test implements ITest, ITest2 {

    @Override
    public void giveMeAbstract() {
        System.out.println("Я абстрактный метод!");
    }

    static void giveMeTest(){
        System.out.println("Я статический метод ласса Test");
    }

    public static synchronized void main(String[] args){

        ITest.giveMeTest();

        ITest test = new Test();
        test.giveMeDefault();

        test.giveMeAbstract();
    }
}
