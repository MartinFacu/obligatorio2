package zFuncionamiento;

import Ventanas.*;
import Main.*;

public class Tematica {
    private String nombre;
    private String descripcion;
    
    public Tematica(String unNombre, String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
