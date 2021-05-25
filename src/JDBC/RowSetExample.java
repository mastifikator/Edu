package JDBC;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.IOException;
import java.sql.*;

public class RowSetExample {
    static String url = "jdbc:mysql://localhost:3306/orc_base";
    static String userName = "root";
    static String userPass = "P@$$w0rd";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        ResultSet resultSet = getResSet();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        CachedRowSet rowSet = (CachedRowSet) resultSet;
        rowSet.setCommand("SELECT * FROM orcs WHERE strength > ?");
        rowSet.setDouble(1, 30);

        rowSet.setUrl(url);
        rowSet.setUsername(userName);
        rowSet.setPassword(userPass);
        rowSet.execute();

        rowSet.absolute(2);
        rowSet.deleteRow();
        rowSet.beforeFirst();
        Connection connection = DriverManager.getConnection(url, userName, userPass);
        connection.setAutoCommit(false);
        rowSet.acceptChanges(connection);

        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

//        while (rowSet.next()) {
//            String name = rowSet.getString("name");
//            Double strength = rowSet.getDouble(3);
//
//            System.out.println(name + " " + strength);
//
//        }

    }

    static ResultSet getResSet() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url, userName, userPass);
             Statement statement = conn.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM orc_base.orcs");

            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet crs = factory.createCachedRowSet();
            crs.populate(rs);

            return crs;
        }
    }
}
