package modelo;

import java.io.File;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import tda.*;

public class Expediente {
    private static int idExpediente = 0;
    private String prioridad;
    private Persona datosInteresado;
    private String asunto;
    private File documentoReferencia;
    private Tramite tramite;
    
    public Expediente() {
        super();
        idExpediente++;
        this.prioridad = "";
        this.datosInteresado = new Docente();  // Asumiendo que Persona tiene un constructor vacío
        this.asunto = "";
        this.documentoReferencia = new File("");
    }

    public Expediente(Date fechaInicio, Date fechaFin, String estado, String prioridad,
            Persona datosInteresado, String asunto, File documentoReferencia, Lista<File> documentosProducto) {
        this.tramite = new Tramite(fechaInicio, fechaFin, estado, documentosProducto);
        idExpediente++;
        this.prioridad = prioridad;
        this.datosInteresado = datosInteresado;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
    }

    // Getters and Setters
    public int getIdExpediente() {
        return idExpediente;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Persona getDatosInteresado() {
        return datosInteresado;
    }

    public void setDatosInteresado(Persona datosInteresado) {
        this.datosInteresado = datosInteresado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public File getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(File documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }

    

    @Override
    public String toString() {
        return "Expediente{" +
                "idExpediente='" + idExpediente + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", datosInteresado=" + datosInteresado +
                ", asunto='" + asunto + '\'' +
                ", documentoReferencia=" + documentoReferencia +
                "} " + super.toString();
    }
    
    public void registrarExpediente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de inicio (yyyy-mm-dd): ");
        String fechaInicioStr = scanner.nextLine();
        this.tramite.setFechaInicio(Date.from(Instant.parse(fechaInicioStr + "T00:00:00Z")));

        System.out.print("Ingrese la fecha de fin (yyyy-mm-dd): ");
        String fechaFinStr = scanner.nextLine();
        this.tramite.setFechaFin(Date.from(Instant.parse(fechaFinStr + "T00:00:00Z")));

        System.out.print("Ingrese el estado del expediente: ");
        this.tramite.setEstado(scanner.nextLine());

        System.out.print("Ingrese la prioridad del expediente: ");
        this.prioridad = scanner.nextLine();
        
        System.out.println("Ingrese clase del interesado");
        String clase = scanner.nextLine();
        
        switch (clase) {
            case "Alumno":
                System.out.print("Ingrese el DNI del interesado: ");
                int dniInteresado = scanner.nextInt();
                System.out.print("Ingrese el nombre del interesado: ");
                String nombreInteresado = scanner.nextLine();
                System.out.print("Ingrese el código del interesado: ");
                int codInteresado = scanner.nextInt();
                System.out.print("Ingrese la carrera profesional: ");
                String cp = scanner.nextLine();
                this.datosInteresado = new Alumno(dniInteresado, nombreInteresado,
                codInteresado, cp);
                break;
            case "Docente":
                System.out.print("Ingrese el DNI del interesado: ");
                dniInteresado = scanner.nextInt();
                System.out.print("Ingrese el nombre del interesado: ");
                nombreInteresado = scanner.nextLine();
                System.out.print("Ingrese el código del interesado: ");
                codInteresado = scanner.nextInt();
                System.out.print("Ingrese la carrera profesional: ");
                Double sueldo = scanner.nextDouble();
                this.datosInteresado = new Docente(dniInteresado, nombreInteresado,
                codInteresado, sueldo);
                break;
            case "Administrativo":
                System.out.print("Ingrese el DNI del interesado: ");
                dniInteresado = scanner.nextInt();
                System.out.print("Ingrese el nombre del interesado: ");
                nombreInteresado = scanner.nextLine();
                System.out.print("Ingrese el código del interesado: ");
                codInteresado = scanner.nextInt();
                System.out.print("Ingrese la carrera profesional: ");
                sueldo = scanner.nextDouble();
                this.datosInteresado = new Administrativo(dniInteresado, nombreInteresado,
                codInteresado, sueldo);
                break;
            case "Externo":
                System.out.print("Ingrese el DNI del interesado: ");
                dniInteresado = scanner.nextInt();
                System.out.print("Ingrese el nombre del interesado: ");
                nombreInteresado = scanner.nextLine();
                System.out.print("Ingrese el código del interesado: ");
                codInteresado = scanner.nextInt();
                System.out.print("Ingrese la password: ");
                String password = scanner.nextLine();
                this.datosInteresado = new Externo(dniInteresado, nombreInteresado,
                codInteresado, password);
                break;
        }

        

        
        System.out.print("Ingrese el asunto del expediente: ");
        this.asunto = scanner.nextLine();

        System.out.print("Ingrese la ruta del documento de referencia: ");
        String rutaDocumentoReferencia = scanner.nextLine();
        this.documentoReferencia = new File(rutaDocumentoReferencia);

        System.out.print("Ingrese la cantidad de documentos del producto: ");
        int numDocs = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        Lista<File> documentosProducto = new Lista<>();
        for (int i = 0; i < numDocs; i++) {
            System.out.print("Ingrese la ruta del documento " + (i + 1) + ": ");
            String rutaDocumento = scanner.nextLine();
            documentosProducto.agregar(new File(rutaDocumento));
        }
        this.tramite.setDocumentosProducto(documentosProducto);
    }
    
}
