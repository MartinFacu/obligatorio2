package zFuncionamiento;

import java.io.Serializable;
import java.util.Observable;

public class Entrevistador extends Observable implements Serializable {

    private String nombre;
    private int cedula;
    private String direccion;
    private int ingresoALaEmpresa;

    public Entrevistador(String nombre, int cedula, String direccion, int ingresoALaEmpresa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.ingresoALaEmpresa = ingresoALaEmpresa;
    }

    // Getter y Setter para el campo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el campo 'cedula'
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    // Getter y Setter para el campo 'direccion'
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter para el campo 'ingresoALaEmpresa'
    public int getIngresoALaEmpresa() {
        return ingresoALaEmpresa;
    }

    public void setIngresoALaEmpresa(int ingresoALaEmpresa) {
        this.ingresoALaEmpresa = ingresoALaEmpresa;
    }

    @Override
    public String toString() {
        return "Entrevistador{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }

}
