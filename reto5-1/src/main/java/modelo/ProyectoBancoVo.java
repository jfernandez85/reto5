/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juan.fernandez
 */
public class ProyectoBancoVo {
    private Integer id;
    private String primer_apellido;
    private String ciudad;
    private String lider;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrimer_Apellido() {
        return primer_apellido;
    }
    public void setPrimer_Apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }
    @Override
    public String toString(){
        return String.format("%3d %-25s %-20s %-15s %7d %-30s", id, primer_apellido, ciudad, lider);
    }
}
