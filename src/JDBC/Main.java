package JDBC;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orc_base";
        String user = "root";
        String pass = "P@$$w0rd";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Отсутствует драйвер для подключения к базе данных");
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             BufferedReader sqlFile = new BufferedReader(new FileReader("X:\\Desktop\\Education\\JAVA\\Edu\\src\\JDBC\\Orcs.sql"));
             Scanner scan = new Scanner(sqlFile);
             Statement statement = conn.createStatement()) {
            System.out.println("Подключение к базе данных прошло успешно");

            String line = "";
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                if (line.endsWith(";")) {
                    line = line.substring(0, line.length() - 1);
                }

                statement.executeUpdate(line);
            }

            ResultSet rs = null;
            try {
                rs = statement.executeQuery("SELECT * FROM orc_base.Orcs");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double strength = rs.getDouble(3);
                    double speed = rs.getDouble(4);
                    System.out.println("orcId = " + id + " name = " + name + " strength = " + strength + " speed = " + speed);
                }
            } catch (SQLException s) {
                System.out.println("Ошибка SQL запроса: " + s.getMessage());
                System.out.println("Состояние SQL: " + s.getSQLState());
                System.out.println("Номер ошибки SQL: " + s.getErrorCode());
            } finally {
                if (rs != null){
                    rs.close();
                }else{
                    System.out.println("Ошибка чтения данных с БД!");
                }

            }

        } catch (SQLException s) {
            System.out.println("Возникли проблемы при подключении к базе давнных");
            System.out.println("Ошибка SQL запроса: " + s.getMessage());
            System.out.println("Состояние SQL: " + s.getSQLState());
            System.out.println("Номер ошибки SQL: " + s.getErrorCode());
            s.printStackTrace();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println("Не найден .sql файл для создания и заполнения базы данных");
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("Возникли проблемы при считывании файла .sql для создания и заполнения базы данных");
        }
    }
}
