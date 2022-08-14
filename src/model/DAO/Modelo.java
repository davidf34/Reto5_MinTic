
package model.DAO;

import java.util.List;
import model.vo.Respuesta1;
import model.vo.Respuesta2;
import model.vo.Respuesta3;
import java.sql.*;
import java.util.ArrayList;
import util.Conexion;

public class Modelo {
    public String respuesta;
    
    public List<Respuesta1> con1() throws SQLException {
        
        Connection conexion = Conexion.getConnection();
        Statement consulta = conexion.createStatement();
        ResultSet rs = consulta.executeQuery("SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC");
        
        ArrayList<Respuesta1> respuesta = new ArrayList<>();
        
        while (rs.next()){
            Respuesta1 res1 = new Respuesta1();
            res1.setId_lider(rs.getInt("ID_Lider"));
            res1.setPrimer_apellido(rs.getString("Primer_Apellido"));
            res1.setNombre(rs.getString("Nombre"));
            res1.setCiudad_residencia(rs.getString("Ciudad_Residencia"));
            respuesta.add(res1);
        }
        return respuesta;
    }
    
    public List<Respuesta2> con2() throws SQLException {
        
        Connection conexion = Conexion.getConnection();
        Statement consulta = conexion.createStatement();
        ResultSet rs = consulta.executeQuery("SELECT ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Barranquilla', 'Santa Marta', 'Cartagena')");
        
        ArrayList<Respuesta2> respuesta = new ArrayList<>();
        
        while (rs.next()){
            Respuesta2 res2 = new Respuesta2();
            res2.setId_proyecto(rs.getInt("ID_Proyecto"));
            res2.setConstructora(rs.getString("Constructora"));
            res2.setNumero_habitaciones(rs.getInt("Numero_Habitaciones"));
            res2.setCiudad(rs.getString("Ciudad"));
            respuesta.add(res2);
        }
        return respuesta;
    }
    
    public List<Respuesta3> con3() throws SQLException {
        
        Connection conexion = Conexion.getConnection();
        Statement consulta = conexion.createStatement();
        ResultSet rs = consulta.executeQuery("SELECT Y.ID_Compra, X.Constructora, X.Banco_Vinculado from Proyecto X JOIN Compra Y ON X.ID_Proyecto = Y.ID_Proyecto WHERE Y.Proveedor = 'Homecenter' AND X.Ciudad = 'Salento'");
        
        ArrayList<Respuesta3> respuesta = new ArrayList<>();
        
        while(rs.next()){
            Respuesta3 res3 = new Respuesta3();
            res3.setId_compra(rs.getInt("ID_Compra"));
            res3.setConstructora(rs.getString("Constructora"));
            res3.setBanco_vinculado(rs.getString("Banco_Vinculado"));
            respuesta.add(res3);
        }
        return respuesta;
    }

}
