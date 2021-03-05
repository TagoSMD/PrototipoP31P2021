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
public class Asignacioncursoalumnos {
    private String codigo_carrera;
    private String codigo_sede;
    private String codigo_jornada;
    private String codigo_seccion;
    private String codigo_aula;
    private String codigo_curso;
    private String carnet_alumno;
    private Double nota_asignacioncursoalumnos;

    public Asignacioncursoalumnos() {
    }

    public Asignacioncursoalumnos(String codigo_carrera, String codigo_sede, String codigo_jornada, String codigo_seccion, String codigo_aula, String codigo_curso, String carnet_alumno, Double nota_asignacioncursoalumnos) {
        this.codigo_carrera = codigo_carrera;
        this.codigo_sede = codigo_sede;
        this.codigo_jornada = codigo_jornada;
        this.codigo_seccion = codigo_seccion;
        this.codigo_aula = codigo_aula;
        this.codigo_curso = codigo_curso;
        this.carnet_alumno = carnet_alumno;
        this.nota_asignacioncursoalumnos = nota_asignacioncursoalumnos;
    }

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public String getCodigo_sede() {
        return codigo_sede;
    }

    public void setCodigo_sede(String codigo_sede) {
        this.codigo_sede = codigo_sede;
    }

    public String getCodigo_jornada() {
        return codigo_jornada;
    }

    public void setCodigo_jornada(String codigo_jornada) {
        this.codigo_jornada = codigo_jornada;
    }

    public String getCodigo_seccion() {
        return codigo_seccion;
    }

    public void setCodigo_seccion(String codigo_seccion) {
        this.codigo_seccion = codigo_seccion;
    }

    public String getCodigo_aula() {
        return codigo_aula;
    }

    public void setCodigo_aula(String codigo_aula) {
        this.codigo_aula = codigo_aula;
    }

    public String getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getCarnet_alumno() {
        return carnet_alumno;
    }

    public void setCarnet_alumno(String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }

    public Double getNota_asignacioncursoalumnos() {
        return nota_asignacioncursoalumnos;
    }

    public void setNota_asignacioncursoalumnos(Double nota_asignacioncursoalumnos) {
        this.nota_asignacioncursoalumnos = nota_asignacioncursoalumnos;
    }

    @Override
    public String toString() {
        return "Asignacioncursoalumnos{" + "codigo_carrera=" + codigo_carrera + ", codigo_sede=" + codigo_sede + ", codigo_jornada=" + codigo_jornada + ", codigo_seccion=" + codigo_seccion + ", codigo_aula=" + codigo_aula + ", codigo_curso=" + codigo_curso + ", carnet_alumno=" + carnet_alumno + ", nota_asignacioncursoalumnos=" + nota_asignacioncursoalumnos + '}';
    }
    
            
            
    
}
