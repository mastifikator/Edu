package InputOutput;

import java.io.*;

public class CopyFile {


    public void copy(String inPath, String outPath){
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream(inPath);
            output = new FileOutputStream(outPath);
        }catch (FileNotFoundException nf){
            System.out.println("Вы ввели не существующий путь");
            nf.printStackTrace();
        }

        try {
            while (input.available() > 0) {
                int data = input.read();
                output.write(data);
            }
        }catch (IOException io){
            System.out.println("Возникла ошибка в процессе копирования");
            io.printStackTrace();
        }finally {
            try {
                input.close();
                output.close();
            }catch (IOException io){
                System.out.println("Возникла ошибка в процессе закрытия потоков");
                io.printStackTrace();
            }
        }

        System.out.println("Файл скопирован");

    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.copy("C:/test/test.txt", "C:/test/test2.txt");

    }

}
