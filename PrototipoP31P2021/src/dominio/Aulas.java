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
public class Aulas {
    
    private String codigo_aula;
    private String nombre_aula;
    private String estatus_aula;

    public Aulas() {
    }

    public Aulas(String codigo_aula, String nombre_aula, String estatus_aula) {
        this.codigo_aula = codigo_aula;
        this.nombre_aula = nombre_aula;
        this.estatus_aula = estatus_aula;
    }

    public String getCodigo_aula() {
        return codigo_aula;
    }

    public void setCodigo_aula(String codigo_aula) {
        this.codigo_aula = codigo_aula;
    }

    public String getNombre_aula() {
        return nombre_aula;
    }

    public void setNombre_aula(String nombre_aula) {
        this.nombre_aula = nombre_aula;
    }

    public String getEstatus_aula() {
        return estatus_aula;
    }

    public void setEstatus_aula(String estatus_aula) {
        this.estatus_aula = estatus_aula;
    }

    @Override
    public String toString() {
        return "Aulas{" + "codigo_aula=" + codigo_aula + ", nombre_aula=" + nombre_aula + ", estatus_aula=" + estatus_aula + '}';
    }
    
    
    
}
