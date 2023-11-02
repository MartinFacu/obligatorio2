package zFuncionamiento;
import Ventanas.*;
import Main.*;
import java.util.*;
public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int numCel;
    private String mail;
    private String linkedin;
    private String formato;
    private HashMap<Tematica, Integer> temas;
    
    public Postulante(String unFormato, String unLinkedin, String unMail, int unNumCel, String unaDireccion, int unaCedula, String unNombre,HashMap<Tematica, Integer> unosTemas){
        this.nombre = unNombre;
        this.formato = unFormato;
        this.linkedin = unLinkedin;
        this.mail = unMail;
        this.numCel = unNumCel;
        this.direccion = unaDireccion;
        this.cedula = unaCedula;
        this.temas = unosTemas;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCel() {
        return numCel;
    }

    public void setNumCel(int numCel) {
        this.numCel = numCel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public void addTema(Tematica unTema, int nivel){
        this.temas.put(unTema, nivel);
    }

    public HashMap<Tematica, Integer> getTemas() {
        return temas;
    }

    @Override
    public String toString() {
        return "Postulante{" + "nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion + ", formato=" + formato + ", temas=" + temas + '}';
    }

    public ArrayList<String> darDatosDelHash(){
        System.out.println("entre a : darDatosDelHash Postulante");
        ArrayList<String> lista = new ArrayList<>();
        Iterator<Tematica> it = temas.keySet().iterator();
        while (it.hasNext()){
            Tematica tematica = it.next(); 
            int nivel = temas.get(tematica);
            lista.add(tematica+"("+nivel+")");
        }
        System.out.println("Sali de : darDatosDelHash");
        return lista;
    }
    
}
