package IONIO;

import java.io.*;
import java.nio.Buffer;

public class TestIO {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);


        System.out.println((char)ir.read());
    }
}
