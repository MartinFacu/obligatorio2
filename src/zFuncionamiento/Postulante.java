package zFuncionamiento;
//Martin Alonso(291799) y Santiago Oliveri
import java.io.Serializable;
import java.util.*;

public class Postulante extends Observable implements Serializable , Comparable<Postulante> {

    private String nombre;
    private int cedula;
    private String direccion;
    private int numCel;
    private String mail;
    private String linkedin;
    private String formato;
    private HashMap<Tematica, Integer> temas;

    public Postulante(String unFormato, String unLinkedin, String unMail, int unNumCel, String unaDireccion, int unaCedula, String unNombre, HashMap<Tematica, Integer> unosTemas) {
        this.nombre = unNombre;
        this.formato = unFormato;
        this.linkedin = unLinkedin;
        this.mail = unMail;
        this.numCel = unNumCel;
        this.direccion = unaDireccion;
        this.cedula = unaCedula;
        this.temas = unosTemas;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumCel() {
        return numCel;
    }

    public String getMail() {
        return mail;
    }

    public String getLinkedin() {
        return linkedin;
    }
    
    
    
    public String getFormato() {
        return formato;
    }

    public void addTema(Tematica unTema, int nivel) {
        this.temas.put(unTema, nivel);
    }

    public HashMap<Tematica, Integer> getTemas() {
        return temas;
    }

    @Override
    public String toString() {
        return "Postulante{" + "nombre=" + nombre + ", cedula=" + cedula + ", mail=" + mail + '}';
    }

    

    public ArrayList<String> darDatosDelHash() {
        System.out.println("entre a : darDatosDelHash Postulante");
        ArrayList<String> lista = new ArrayList<>();
        Iterator<Tematica> it = temas.keySet().iterator();
        while (it.hasNext()) {
            Tematica tematica = it.next();
            int nivel = temas.get(tematica);
            lista.add(tematica + "(" + nivel + ")");
        }
        System.out.println("Sali de : darDatosDelHash");
        return lista;
    }

    @Override
    public int compareTo(Postulante otroPostulante) {
        // Comparar por el atributo 'cedula'
        return Integer.compare(this.cedula, otroPostulante.cedula);
    }

}
