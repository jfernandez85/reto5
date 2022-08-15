/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author juan.fernandez
 */
public class proyecto2dao {
      public List<proyecto2vo> listar() throws SQLException {
        ArrayList <proyecto2vo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt= null;
        ResultSet rs =null;
        String consulta ="SELECT ID_Proyecto ID, Constructora, Numero_Habitaciones, Ciudad " +
                            "FROM Proyecto p " +
                            "WHERE Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla') " +
                            "AND Clasificacion ='Casa Campestre';";
        try{
            stmt= conn.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
                proyecto2vo objeto2 = new proyecto2vo();
                objeto2.setId(rs.getInt("id"));
                objeto2.setConstructora(rs.getString("constructora"));
                objeto2.setCiudad(rs.getString("ciudad"));
                objeto2.setHabitaciones(rs.getInt("numero_habitaciones"));
                respuesta.add(objeto2);
            }
        } finally {
            if (rs != null){
            rs.close();
            }
            if (stmt != null) {
            stmt.close();
            }
            if (conn != null){
            conn.close();
            }
        } 
        return respuesta;
    }
}
