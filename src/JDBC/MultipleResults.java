package JDBC;

import java.sql.*;

public class MultipleResults {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/orc_base";
        String userName = "root";
        String userPass = "P@$$w0rd";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, userPass)) {
            CallableStatement callableStatement = null;
            try{
                callableStatement = conn.prepareCall("{CALL tablesCount}");
                boolean hasResult = callableStatement.execute();
                ResultSet resultSet = null;
                try{
                    while (hasResult){
                        resultSet = callableStatement.getResultSet();
                        while (resultSet.next()){
                            System.out.println("Колличество записей в таблице: " + resultSet.getInt(1));
                        }
                        hasResult = callableStatement.getMoreResults();
                    }
                }catch (SQLException s){
                    s.printStackTrace();
                }finally {
                    if (resultSet != null) resultSet.close();
                    else System.err.println("Ошибка работы с БД");
                }

            }catch (SQLException s){
                s.printStackTrace();
            }finally {
                callableStatement.close();
            }
        }
    }
}
