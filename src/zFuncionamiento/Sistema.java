package zFuncionamiento;

import Ventanas.*;
import Main.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<Puesto> puestos;
    private ArrayList<Entrevistador> entrevistadores;
    private ArrayList<Postulante> postulantes;

    public Sistema(ArrayList<Entrevista> entrevistas, ArrayList<Puesto> puestos, ArrayList<Entrevistador> entrevistadores, ArrayList<Postulante> postulantes) {
        this.entrevistas = entrevistas;
        this.puestos = puestos;
        this.entrevistadores = entrevistadores;
        this.postulantes = postulantes;
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
}
