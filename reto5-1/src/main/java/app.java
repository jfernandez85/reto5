
import vista.ReportesView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juan.fernandez
 */
public class app {
    public static void main( String[] args )
    {
        System.out.println( "Requerimiento 1" );
        ReportesView reportesView = new ReportesView();
        String banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);
    }
}
