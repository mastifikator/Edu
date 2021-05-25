package JDBC;

import java.sql.*;

public class PrepStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String userName = "root";
        String userPass = "P@$$w0rd";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, userPass)) {
            PreparedStatement prepStat = null;
            try {
                prepStat = conn.prepareStatement("INSERT INTO orc_base.orcs (name, strength, speed) VALUES (?,?,?)");
                prepStat.setString(1, "Борян");
                prepStat.setDouble(2, 34.2);
                prepStat.setDouble(3, 33.8);
                prepStat.execute();

                ResultSet rs = null;
                try {
                    rs = prepStat.executeQuery("SELECT * FROM orc_base.orcs");
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        double strength = rs.getDouble(3);
                        double speed = rs.getDouble(4);
                        System.out.println(id + " " + name + " " + strength + " " + speed);
                    }
                } catch (SQLException s){
                    s.printStackTrace();
                }finally {
                    if (rs != null) rs.close();
                    else System.err.println("Ошибка чтения с БД");
                }
            }catch (SQLException s){
                s.printStackTrace();
            }finally {
                prepStat.close();
            }

        }

    }
}
