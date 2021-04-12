package Tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {
    private String address;

    public ConsoleReader(String address){
        this.address = address;
    }

    public void writeConsole() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(address)));

        /*while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }*/

        /*InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(address));
        while(inputStreamReader.ready()){
            System.out.println(inputStreamReader.read());
        }*/

        Scanner scanner =  new Scanner(new FileInputStream((address)));
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }

    public static void main(String[] args) throws IOException {
        ConsoleReader consoleReader = new ConsoleReader("X:\\Desktop\\Education\\MyStack.txt");
        consoleReader.writeConsole();
    }
}
