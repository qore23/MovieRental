package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection connection;
    static String db = "movies_rental";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.db;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("COnexion ok");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exepcion o error en coneccion: " + ex.getMessage());
        }

    }
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection=null;
    }
}
