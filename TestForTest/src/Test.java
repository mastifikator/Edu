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

class AnotherTrainComing extends Exception { }

interface Inter{

}

public class Test {
    static String a;

    static Thread laurel, hardy;



    public static synchronized void main(String[] args){
        StringBuilder sb = new StringBuilder(8);

        List l = new ArrayList();
        l.add("dsff");
        l.add(5);
        l.add(true);
        Thread.yield();

        Thread t = new Thread();

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        System.out.println(l.size());

    }



    static int b;
    static String c;
    public class TestSerial implements Serializable {


        private void writeObject(ObjectOutputStream out){
            synchronized(Test.class){};

        }

        private void readObject(ObjectInputStream in){

        }


    }

}
