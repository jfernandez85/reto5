/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.SQLException;
import java.util.List;
import modelo.ProyectoBancoDao;
import modelo.ProyectoBancoVo;
import modelo.proyecto2dao;
import modelo.proyecto2vo;
import modelo.proyecto3dao;
import modelo.proyecto3vo;
//
//import grupo50.reto4.model.dao.ComprasDeLiderDao;
//import grupo50.reto4.model.dao.ProyectoBancoDao;
//import grupo50.reto4.model.vo.ComprasDeLiderVo;
//import grupo50.reto4.model.vo.DeudasPorProyectoVo;
//import grupo50.reto4.model.vo.ProyectoBancoVo;
//import grupo50.reto4.model.dao.DeudasPorProyectoDao;

public class ReportesController {
    private ProyectoBancoDao proyectoBancoDao;
    private proyecto2dao proyecto2dao;
    private proyecto3dao proyecto3dao;
    
    public ReportesController (){
        proyectoBancoDao = new ProyectoBancoDao();
        proyecto2dao = new proyecto2dao();
        proyecto3dao = new proyecto3dao();
    }
    public List<ProyectoBancoVo> listaTotalProyectoBanco () throws SQLException{
        return proyectoBancoDao.listar();
    }
     public List<proyecto2vo> lista2 () throws SQLException{
        return proyecto2dao.listar();
    }
    public List<proyecto3vo> lista3 () throws SQLException{
        return proyecto3dao.listar3();
    }
}

