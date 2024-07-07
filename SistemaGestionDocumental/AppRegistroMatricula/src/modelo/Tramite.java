package modelo;

import java.io.File;
import java.util.Date;
import java.util.List;
import tda.*;

public class Tramite {
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Lista<File> documentosProducto;
    
    public Tramite() {
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.estado = "";
        this.documentosProducto = new Lista();
    }
    

    public Tramite(Date fechaInicio, Date fechaFin, String estado, Lista<File> documentosProducto) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    // Getters and Setters
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Lista<File> getDocumentosProducto() {
        return documentosProducto;
    }

    public void setDocumentosProducto(Lista<File> documentosProducto) {
        this.documentosProducto = documentosProducto;
    }
    
    public void addDocumentos(File doc) {
        this.documentosProducto.agregar(doc);
    }

    @Override
    public String toString() {
        return "Trámite{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", estado='" + estado + '\'' +
                ", documentosProducto=" + documentosProducto +
                '}';
    }
}
