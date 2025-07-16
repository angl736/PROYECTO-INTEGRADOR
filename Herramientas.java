package proyecto_integrador;

public class Herramientas {
    private int id_herramienta;
    private String nombre;
    private String categoria;
    private int codigo;
    private String estado;

    public Herramientas(int id_herramienta, String nombre, String categoria, int codigo, String estado) {
        this.id_herramienta = id_herramienta;
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.estado = estado;
    }

    public int getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
