package zFuncionamiento;
//Martin Alonso(291799) y Santiago Oliveri
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Puesto extends Observable implements Serializable {

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

    @Override
    public String toString() {
        return nombre;
    }

}
