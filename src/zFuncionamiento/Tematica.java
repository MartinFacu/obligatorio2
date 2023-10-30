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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
