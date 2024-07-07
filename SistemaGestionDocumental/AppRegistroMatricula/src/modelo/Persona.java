package modelo;

import java.util.Scanner;

public abstract class Persona {
    // Atributos
    protected int dni;
    protected String nombres;
    // Metodos
    // Constructor
    public Persona() {
        this.dni = 0;
        this.nombres = "";
    }

    public Persona(int dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }
    // Getter and setter

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    // Otros metodos
    public void leer(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la informacion de la Persona: ");
        System.out.print("Ingrese el DNI: ");
        this.dni = lector.nextInt();
        System.out.println("Ingrese los nombres: ");
        lector.nextLine();
        this.nombres = lector.nextLine();
    }
    public String verDatos(){
        return this.dni + "\t" + this.nombres + "\t"+
                getEmailInstitucional();
    }
    
    public abstract String getEmailInstitucional();

    @Override
    public String toString() {
        return nombres;
    }
}
