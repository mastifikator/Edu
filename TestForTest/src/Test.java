import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception{

        StringBuilder stringBuilder = new StringBuilder("dggds");

        String a = "";

    }

    static int b;
    static String c;
    public class TestSerial implements Serializable {

        {
            System.out.println(b);
        }

        private void writeObject(ObjectOutputStream out){
            synchronized(Test.class){};

        }

        private void readObject(ObjectInputStream in){

        }


    }

}
