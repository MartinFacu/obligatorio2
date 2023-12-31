package zFuncionamiento;
//Martin Alonso(291799) y Santiago Oliveri
import java.io.Serializable;
import java.util.Observable;

public class Tematica extends Observable implements Serializable {

    private String nombre;
    private String descripcion;

    public Tematica(String unNombre, String unaDescripcion) {
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }

    public String getNombre() {
        return nombre;
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
