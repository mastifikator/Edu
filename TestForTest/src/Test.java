import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    static int b;
    static String c;
    public class TestSerial implements Serializable {



        private void writeObject(ObjectOutputStream out){
            synchronized(Test.class){};

        }

        private void readObject(ObjectInputStream in){

        }


    }



    public static void main(String[] args) throws Exception{

        Object obj = new Object();
        Integer b;
        System.out.println(c);





     }
}
