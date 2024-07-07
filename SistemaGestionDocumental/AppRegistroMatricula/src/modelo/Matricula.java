
package modelo;

import java.util.Date;

public class Matricula {
    
    //Atributos
    
    private int numero;
    private Date fecha;
    private Alumno alumno;
    private Curso curso;
    
    //Constructores
    
    public Matricula() {
        this.numero = 0;
        this.fecha = new Date();
        this.alumno = null;
        this.curso = null;
    }

    public Matricula(int numero, Date fecha, Alumno alumno, Curso curso) {
        this.numero = numero;
        this.fecha = fecha;
        this.alumno = alumno;
        this.curso = curso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        
        return String.valueOf(numero);
    }
    
    
    
    
    

}
