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
public class Carreras {
    
    private String codigo_carrera;
    private String nombre_carrera;
    private String codigo_facultad;
    private String estatus_carrera;

    public Carreras() {
    }

    public Carreras(String codigo_carrera, String nombre_carrera, String codigo_facultad, String estatus_carrera) {
        this.codigo_carrera = codigo_carrera;
        this.nombre_carrera = nombre_carrera;
        this.codigo_facultad = codigo_facultad;
        this.estatus_carrera = estatus_carrera;
    }

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getCodigo_facultad() {
        return codigo_facultad;
    }

    public void setCodigo_facultad(String codigo_facultad) {
        this.codigo_facultad = codigo_facultad;
    }

    public String getEstatus_carrera() {
        return estatus_carrera;
    }

    public void setEstatus_carrera(String estatus_carrera) {
        this.estatus_carrera = estatus_carrera;
    }

    @Override
    public String toString() {
        return "Carreras{" + "codigo_carrera=" + codigo_carrera + ", nombre_carrera=" + nombre_carrera + ", codigo_facultad=" + codigo_facultad + ", estatus_carrera=" + estatus_carrera + '}';
    }
    
    
    
    
}
