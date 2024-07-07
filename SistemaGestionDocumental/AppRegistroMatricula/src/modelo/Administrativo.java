package modelo;

import java.util.Scanner;

public class Administrativo extends Persona {
    // Atributos
    private int codAdministrativo;
    private double sueldo;
    
    // Constructores
    public Administrativo() {
        super(); // llamado al constructor sin parametros del padre
        this.codAdministrativo = 0;
        this.sueldo = 0;
    }

    public Administrativo(int dni, String nombres, int codAdministrativo, double sueldo) {
        super(dni, nombres); // llamado al constructor del padre
        this.codAdministrativo = codAdministrativo;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public int getCodAdministrativo() {
        return codAdministrativo;
    }

    public void setCodAdministrativo(int codAdministrativo) {
        this.codAdministrativo = codAdministrativo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // Métodos
    @Override
    public void leer() {
        Scanner lector = new Scanner(System.in);
        super.leer(); // lee los atributos del padre - dni y nombres
        System.out.print("Ingrese el Código Administrativo: ");
        this.codAdministrativo = lector.nextInt();
        System.out.print("Ingrese el Departamento: ");
        lector.nextLine(); // Consumir la nueva línea pendiente
        this.sueldo = lector.nextDouble();
    }

    @Override
    public String verDatos() {
        return super.verDatos() + "\t" +
                this.codAdministrativo + "\t" +
                this.sueldo;
    }

    @Override
    public String getEmailInstitucional() {
        return this.codAdministrativo + "@admin.ulima.edu.pe";
    }
}
