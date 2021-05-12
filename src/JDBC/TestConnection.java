package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String userPass = "P@$$w0rd";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Отсутствует класс драйвера для подключения к базе данных");
            e.printStackTrace();
        }

        try(Connection conn = DriverManager.getConnection(url, userName, userPass)){
            System.out.println("Подключение прошло успешно");
        }catch (SQLException s){
            System.out.println("Возникли проблемы при подключении к базе данных");
            s.printStackTrace();
        }

    }
}
