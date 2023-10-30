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
        this.entrevistas = new ArrayList<Entrevista>();
        this.puestos = new ArrayList<Puesto>();
        this.entrevistadores = new ArrayList<Entrevistador>();
        this.postulantes = new ArrayList<Postulante>();
        this.tematicas = new ArrayList<Tematica>();
        this.hashMapTematicasConNivel=new HashMap();
    }

    public ArrayList<String> darDatosDelHash(){
        ArrayList<String> lista = new ArrayList<>();
        Iterator<Tematica> it = hashMapTematicasConNivel.keySet().iterator();
        while (it.hasNext()){
            lista.add(it.next()+"("+hashMapTematicasConNivel.get(it)+")");
        }
        return lista;
    }

    public void setHashMapTematicasConNivel(HashMap<Tematica, Integer> hashMapTematicasConNivel) {
        this.hashMapTematicasConNivel = hashMapTematicasConNivel;
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

    public void setPostulantes(ArrayList<Postulante> postulantes) {
        this.postulantes = postulantes;
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
    
    
}
