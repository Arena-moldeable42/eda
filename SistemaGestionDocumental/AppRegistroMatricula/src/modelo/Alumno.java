package modelo;

import java.util.Scanner;

public class Alumno extends Persona{
    // Atributos
    private int codAlumno;
    private String cp; // Carrera profesional    
    // Metodos

    public Alumno() {
        super(); // llamado al constructor sin parametros del padre
        this.codAlumno = 0;
        this.cp = "";        
    }

    public Alumno(int dni, String nombres, int codAlumno, String cp) {
        super(dni, nombres); // llamado al constructor del padre
        this.codAlumno = codAlumno;
        this.cp = cp;
    }
    // Getter and Setter

    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    // Otros metodos
    @Override
    public void leer(){
        Scanner lector = new Scanner(System.in);
        super.leer(); // lee los atributos del padre - dni y nombres
        System.out.print("Ingrese el Codigo Alumno: ");
        this.codAlumno = lector.nextInt();
        System.out.print("Ingrese la Carrera Profesional: ");
        lector.nextLine();
        this.cp = lector.nextLine();
    }
    @Override
    public String verDatos(){
        return super.verDatos() + "\t" +
                this.codAlumno + "\t" +
                this.cp;
    }
    
    @Override
    public String getEmailInstitucional(){
        return this.codAlumno+"@aloe.ulima.edu.pe";
    }
    
    
    
}
