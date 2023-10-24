package zFuncionamiento;

import java.util.ArrayList;

public class Puesto {
    private String nombre;
    private String tipo;
    private ArrayList<Tematica> temas;

    public Puesto(String nombre, String tipo, ArrayList<Tematica> temas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temas = temas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tematica> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tematica> temas) {
        this.temas = temas;
    }
    
    
}
