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

//import modelo.ProyectoBancoVo;
import util.JDBCUtilities;


public class ProyectoBancoDao {
    public List<ProyectoBancoVo> listar() throws SQLException {
        ArrayList <ProyectoBancoVo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt= null;
        ResultSet rs =null;
        String consulta ="SELECT ID_Lider ID,Nombre, Primer_Apellido, Ciudad_Residencia ciudad " +
                            "FROM Lider l " +
                            "ORDER BY Ciudad_Residencia ASC;";
        try{
            stmt= conn.createStatement();
            rs = stmt.executeQuery(consulta);
            while(rs.next()){
                ProyectoBancoVo objeto = new ProyectoBancoVo();
                objeto.setId(rs.getInt("id"));
                objeto.setLider(rs.getString("Nombre"));
                objeto.setPrimer_Apellido(rs.getString("primer_apellido"));
                objeto.setCiudad(rs.getString("ciudad"));

                respuesta.add(objeto);
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

