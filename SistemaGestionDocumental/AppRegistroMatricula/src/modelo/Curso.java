
package modelo;

public class Curso {
    //Atributos
    
    private int codCurso;
    private String nombre;
    private int horas;
    private Docente Docente;
    
    //Constructores
    
    public Curso() {
        this.codCurso = 0;
        this.nombre = "";
        this.horas = 0;
        this.Docente = null;
    }

    public Curso(int codCurso, String nombre, int horas, Docente Docente) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.horas = horas;
        this.Docente = Docente;
    }
    
    //Get And Set

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Docente getDocente() {
        return Docente;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
