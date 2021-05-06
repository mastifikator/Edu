import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public class TestSerial implements Serializable {

        private void writeObject(ObjectOutputStream out){

        }

        private void readObject(ObjectInputStream in){

        }


    }


    public static void main(String[] args) throws Exception{

        String a = "a";
        Integer b = 2;
        System.out.println(b instanceof Integer);

     }
}
