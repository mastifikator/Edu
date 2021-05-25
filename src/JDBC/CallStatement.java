package JDBC;

import java.sql.*;

public class CallStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/orc_base";
        String userName = "root";
        String userPass = "P@$$w0rd";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, userPass)) {
            CallableStatement callState = null;
            try{
                callState = conn.prepareCall("{CALL orcsCount(?)}");
                callState.registerOutParameter(1, Types.INTEGER);
                callState.execute();
                System.out.println("Колличество записей в таблице: " + callState.getInt(1));
            }catch (SQLException s){
                s.printStackTrace();
            }finally {
                callState.close();
            }
        }
    }
}
