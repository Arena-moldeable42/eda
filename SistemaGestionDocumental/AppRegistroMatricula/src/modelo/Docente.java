package modelo;

import java.util.Scanner;

public class Docente extends Persona implements IRemuneracion {
    // Atributos
    private int codDocente;
    private double sueldoBruto;

    public Docente() {
        super();
        this.codDocente = 0;
        this.sueldoBruto = 0;
    }
    public Docente(int dni, String nombres, int codDocente, double sueldoBruto){
        super(dni,nombres);
        this.codDocente = codDocente;
        this.sueldoBruto = sueldoBruto;        
    }

    public int getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(int codDocente) {
        this.codDocente = codDocente;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    // Leer
    @Override
    public void leer(){
        Scanner lector = new Scanner(System.in);
        super.leer();
        System.out.print("Ingrese el CodDocente: ");
        this.codDocente = lector.nextInt();
        System.out.print("Ingrese el Sueldo Bruto: ");
        this.sueldoBruto = lector.nextDouble();
    }
    @Override
    public String verDatos(){
        return super.verDatos() + "\t"+
                this.codDocente + "\t"+
                this.sueldoBruto;        
    }
    
    @Override
    public String getEmailInstitucional(){
        int longitud = this.nombres.length();
        String user = this.nombres.substring(0, longitud-1); // hernan --> herna
        return user+"@ulima.edu.pe";
    }
    
    @Override
    public double calcularSalario(){
        double imp = this.sueldoBruto*IRemuneracion.IMP_RENTA;
        double bonif = this.sueldoBruto * 0.5;
        double sueldo = this.sueldoBruto - imp + bonif;
        return sueldo;
    }
    
    
}
