/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author TagoKG
 */
public class Jornadas {
    
   private String codigo_jornada;
   private String nombre_jornada;
   private String estatus_jornada;

    public Jornadas() {
    }

    public Jornadas(String codigo_jornada, String nombre_jornada, String estatus_jornada) {
        this.codigo_jornada = codigo_jornada;
        this.nombre_jornada = nombre_jornada;
        this.estatus_jornada = estatus_jornada;
    }

    public String getCodigo_jornada() {
        return codigo_jornada;
    }

    public void setCodigo_jornada(String codigo_jornada) {
        this.codigo_jornada = codigo_jornada;
    }

    public String getNombre_jornada() {
        return nombre_jornada;
    }

    public void setNombre_jornada(String nombre_jornada) {
        this.nombre_jornada = nombre_jornada;
    }

    public String getEstatus_jornada() {
        return estatus_jornada;
    }

    public void setEstatus_jornada(String estatus_jornada) {
        this.estatus_jornada = estatus_jornada;
    }

    @Override
    public String toString() {
        return "Jornadas{" + "codigo_jornada=" + codigo_jornada + ", nombre_jornada=" + nombre_jornada + ", estatus_jornada=" + estatus_jornada + '}';
    }
   
   
   
   
   
    
}
