package proyecto_integrador;

import java.time.LocalDate;

public class Reporte {
    private int id_reporte;
    private String tipoReporte;
    private LocalDate fechaGeneracion;
    private String contenido;

    public Reporte(int id_reporte, String tipoReporte, LocalDate fechaGeneracion, String contenido) {
        this.id_reporte = id_reporte;
        this.tipoReporte = tipoReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.contenido = contenido;
    }

    public int getId_reporte() {
        return id_reporte;
    }

    public void setId_reporte(int id_reporte) {
        this.id_reporte = id_reporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}