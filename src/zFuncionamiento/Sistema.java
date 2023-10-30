package zFuncionamiento;

import Ventanas.*;
import Main.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Sistema {
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<Puesto> puestos;
    private ArrayList<Entrevistador> entrevistadores;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Tematica> tematicas;
    private HashMap<Tematica, Integer> hashMapTematicasConNivel;

    public Sistema(ArrayList<Entrevista> entrevistas, ArrayList<Puesto> puestos, ArrayList<Entrevistador> entrevistadores, ArrayList<Postulante> postulantes, ArrayList<Tematica> tematicas) {
        this.entrevistas = entrevistas;
        this.puestos = puestos;
        this.entrevistadores = entrevistadores;
        this.postulantes = postulantes;
        this.tematicas = tematicas;
        this.hashMapTematicasConNivel=new HashMap();
    }

    
    
    public Sistema(){    
        this.entrevistas = new ArrayList<>();
        this.puestos = new ArrayList<>();
        this.entrevistadores = new ArrayList<>();
        this.postulantes = new ArrayList<>();
        this.tematicas = new ArrayList<>();
        this.hashMapTematicasConNivel=new HashMap();
    }

    public ArrayList<String> darDatosDelHash(){
        System.out.println("entre a : darDatosDelHash");
        ArrayList<String> lista = new ArrayList<>();
        Iterator<Tematica> it = hashMapTematicasConNivel.keySet().iterator();
        while (it.hasNext()){
            Tematica tematica = it.next(); 
            int nivel = hashMapTematicasConNivel.get(tematica);
            lista.add(tematica+"("+nivel+")");
        }
        System.out.println("Sali de : darDatosDelHash");
        return lista;
    }
    
    public void eliminarUnDatoDelHash(String dato){
        System.out.println("entre a : eliminarUnDatoDelHash");
        String[] datoEnPartes = dato.split("\\(");
        String tematicaSeleccionada = datoEnPartes[0];
        Iterator<Tematica> it = hashMapTematicasConNivel.keySet().iterator();
        while (it.hasNext()){
            Tematica tematica = it.next(); 
            if(tematica.getNombre().equals(tematicaSeleccionada)){
                hashMapTematicasConNivel.remove(tematica);
            }
        }
        System.out.println("Sali de : eliminarUnDatoDelHash");
    }

    public HashMap<Tematica, Integer> getHashMapTematicasConNivel() {
        return hashMapTematicasConNivel;
    }
    public ArrayList<Tematica> getTematicas() {
        return tematicas;
    }

    public void setTematicas(ArrayList<Tematica> tematicas) {
        this.tematicas = tematicas;
    }
    
    
    public ArrayList<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public void setEntrevistas(ArrayList<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }

    public ArrayList<Entrevistador> getEntrevistadores() {
        return entrevistadores;
    }

    public void setEntrevistadores(ArrayList<Entrevistador> entrevistadores) {
        this.entrevistadores = entrevistadores;
    }

    public ArrayList<Postulante> getPostulantes() {
        return postulantes;
    }

    public void agregarPostulante(Postulante postulante) {
        this.postulantes.add(postulante);
        System.out.println("postulante ingresado");
    }
    
    public void eliminarUnPostulante(Postulante unPostulante){
        int cedulaAEliminar= unPostulante.getCedula();
        for(int i=0; i<this.postulantes.size();i++){
            int pos = this.postulantes.get(i).getCedula();
            if(pos==cedulaAEliminar){
                this.postulantes.remove(i);
            }
        }
    }
    
    public void agregarUnaTematica(Tematica unTema){
        this.tematicas.add(unTema);
        System.out.println("tema ingresado");
    }
    
    public void agregarAlHashMap(Tematica unTema, Integer unNivel){
        this.hashMapTematicasConNivel.put(unTema,unNivel);
        System.out.println("Agregado al HashMap");
    }
    
    public void limpiarHashMap(){
        hashMapTematicasConNivel.clear();
    }
    
}
