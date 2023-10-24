package zFuncionamiento;
import Ventanas.*;
import Main.*;
import java.util.ArrayList;
public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int numCel;
    private String mail;
    private String linkedin;
    private String formato;
    
    public Postulante(String unFormato, String unLinkedin, String unMail, int unNumCel, String unaDireccion, int unaCedula, String unNombre){
        this.nombre = unNombre;
        this.formato = unFormato;
        this.linkedin = unLinkedin;
        this.mail = unMail;
        this.numCel = unNumCel;
        this.direccion = unaDireccion;
        this.cedula = unaCedula;
    }
}
