package modelo;

import java.util.Scanner;

public class Externo extends Persona{
    // Atributos
    private int codExterno;
    private String password; // Carrera profesional    
    // Metodos

    public Externo() {
        super(); // llamado al constructor sin parametros del padre
        this.codExterno = 0;
        this.password = "";        
    }

    public Externo(int dni, String nombres, int codAlumno, String cp) {
        super(dni, nombres); // llamado al constructor del padre
        this.codExterno = codAlumno;
        this.password = cp;
    }
    // Getter and Setter

    public int getCodExterno() {
        return codExterno;
    }

    public void setCodExterno(int codExterno) {
        this.codExterno = codExterno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // Otros metodos
    @Override
    public void leer(){
        Scanner lector = new Scanner(System.in);
        super.leer(); // lee los atributos del padre - dni y nombres
        System.out.print("Ingrese el Codigo Alumno: ");
        this.codExterno = lector.nextInt();
        System.out.print("Ingrese la Carrera Profesional: ");
        lector.nextLine();
        this.password = lector.nextLine();
    }
    @Override
    public String verDatos(){
        return super.verDatos() + "\t" +
                this.codExterno + "\t" +
                this.password;
    }
    
    @Override
    public String getEmailInstitucional(){
        return this.codExterno+"@aloe.ulima.edu.pe";
    }
    
    
    
}
