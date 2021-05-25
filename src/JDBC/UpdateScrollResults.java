package JDBC;

import java.io.IOException;
import java.sql.*;

public class UpdateScrollResults {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/orc_base";
        String userName = "root";
        String userPass = "P@$$w0rd";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, userPass)) {
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet res = null;
            try{
                res = statement.executeQuery("SELECT * FROM orc_base.orcs");
//                while (res.next()){
//                    int id = res.getInt(1);
//                    double strength = res.getDouble(3);
//                    if(id == 3){
//                        res.updateString("name", "Stanislav");
//                        res.updateDouble(3, strength - 10);
//                        res.updateRow();
//                    }
//                }
                if (res.absolute(2)) System.out.println(res.getString("name"));
                if (res.previous()) System.out.println(res.getString("name"));
                if (res.last()) System.out.println(res.getString("name"));
                if (res.relative(-4)) {
                    ResultSetMetaData rsmd = res.getMetaData();
                    while (res.next()){
                        for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
                            String field = rsmd.getColumnName(i);
                            String value = res.getString(field);
                            System.out.print(field + ":" + value + " ");
                        }
                        System.out.println("");
                    }
                }
            }catch (SQLException s){
                s.printStackTrace();
            }finally {
                if (res != null) res.close();
                else System.err.println("Ошибка работы с БД!");
            }
        }
    }
}
