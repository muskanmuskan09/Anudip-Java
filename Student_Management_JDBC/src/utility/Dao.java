/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muska
 */
public class Dao {
    // siglton class 

    String url = "jdbc:mysql://localhost:3306/anp8706";
    String dbname = "root";
    String dbpass = "WJ28@krhps";

    private Dao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Dao connectionFactory = null;

    public static Dao getConnectionFactory() {
        if (connectionFactory == null) {
            connectionFactory = new Dao();
        }
        return connectionFactory;
    }

    public Connection getConnection() throws SQLException {

        Connection con = DriverManager.getConnection(url, dbname, dbpass);

        return con;

    }

}
