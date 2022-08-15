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
public class proyecto3dao {
      public List<proyecto3vo> listar3() throws SQLException {
        ArrayList <proyecto3vo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt= null;
        ResultSet rs =null;
        String consulta ="SELECT ID_Compra ID, p.Constructora, p.Banco_Vinculado banco " +
                            "FROM Compra c " +
                            "INNER JOIN Proyecto p ON c.ID_Proyecto =p.ID_Proyecto " +
                            "WHERE p.Ciudad ='Salento' " +
                            "AND c.Proveedor ='Homecenter';";
        try{
            stmt= conn.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
                proyecto3vo objeto3 = new proyecto3vo();
                objeto3.setId(rs.getInt("id"));
                objeto3.setConstructora(rs.getString("constructora"));
                objeto3.setBanco(rs.getString("banco"));
                respuesta.add(objeto3);
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
