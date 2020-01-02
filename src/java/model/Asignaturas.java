package model;
// Generated 11/03/2018 02:52:05 AM by Hibernate Tools 4.3.1



/**
 * Asignaturas generated by hbm2java
 */
public class Asignaturas  implements java.io.Serializable {


     private Integer idasignaturas;
     private Alumno alumno;
     private Profesor profesor;
     private String nombre;
     private String descripcion;
     private Integer creditos;
     private Integer horas;

    public Asignaturas() {
    }

    public Asignaturas(Alumno alumno, Profesor profesor, String nombre, String descripcion, Integer creditos, Integer horas) {
       this.alumno = alumno;
       this.profesor = profesor;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.creditos = creditos;
       this.horas = horas;
    }
   
    public Integer getIdasignaturas() {
        return this.idasignaturas;
    }
    
    public void setIdasignaturas(Integer idasignaturas) {
        this.idasignaturas = idasignaturas;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    public Integer getHoras() {
        return this.horas;
    }
    
    public void setHoras(Integer horas) {
        this.horas = horas;
    }




}


