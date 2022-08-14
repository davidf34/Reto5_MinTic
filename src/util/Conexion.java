
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:sqlite:ProyectosConstruccion.db";
        DriverManager.registerDriver(new org.sqlite.JDBC());
        return DriverManager.getConnection(url);
    } 
}
