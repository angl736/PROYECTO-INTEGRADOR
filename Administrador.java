package proyecto_integrador;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    
    public static List<Herramientas> herramientasDisponibles = new ArrayList<>();

    public Administrador(String nombre, String matricula, String contraseña, String rol) {
        super(nombre, matricula, contraseña, rol);
    }
    
}
