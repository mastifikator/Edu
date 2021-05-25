package JDBC;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.sql.*;

public class BlobExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/orc_base";
        String userName = "root";
        String userPass = "P@$$w0rd";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection conn = DriverManager.getConnection(url, userName, userPass)){
            Statement statement = conn.createStatement();
            //statement.executeUpdate("CREATE TABLE Images (name VARCHAR(15), d DATE, image BLOB)");

            PreparedStatement preparedStatement = null;
            try{
                BufferedImage image = ImageIO.read(new File("X:\\Desktop\\Education\\JAVA\\Edu\\src\\JDBC\\orc.jpg"));
                Blob orc = conn.createBlob();

                try(OutputStream outputStream = orc.setBinaryStream(1)){
                    ImageIO.write(image, "jpg", outputStream);
                }
                preparedStatement = conn.prepareStatement("INSERT INTO orc_base.images (name, d, image) VALUES (?, {d ?}, ?)");
                preparedStatement.setString(1, "Орк");
                preparedStatement.setDate(2, Date.valueOf("2021-05-25"));
                preparedStatement.setBlob(3, orc);
                preparedStatement.execute();

                ResultSet resultSet = null;
                try{
                    resultSet = preparedStatement.executeQuery("SELECT * FROM orc_base.images");
                    while (resultSet.next()){
                        Blob newOrc = resultSet.getBlob(2);
                        BufferedImage newImage = ImageIO.read(newOrc.getBinaryStream());
                        File outFile = new File("X:\\Desktop\\Education\\JAVA\\Edu\\src\\JDBC\\savedOrc.jpg");
                        ImageIO.write(newImage, "jpg", outFile);
                    }
                }catch (SQLException s){
                    s.printStackTrace();
                }finally {
                    if (resultSet != null) resultSet.close();
                    else System.err.println("Ошибка чтения с БД!");
                }
            }catch (SQLException ss){
                ss.printStackTrace();
            }
        }
    }
}
