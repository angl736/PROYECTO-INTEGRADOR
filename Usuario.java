
package proyecto_integrador;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String matricula;
    private String contraseña;
    private String rol; // Nuevo atributo para el rol, se usara en el futuro
    
    public Usuario(String nombre, String matricula, String contraseña,String rol) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getContraseña() {
        return contraseña;
    }
    public String getRol() {
        return rol;
    }

    // static para almacenar usuarios
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
}
