package zFuncionamiento;

import java.util.*;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable {
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
        notificarObservers();
    }

    public HashMap<Tematica, Integer> getHashMapTematicasConNivel() {
        return hashMapTematicasConNivel;
    }
    
    public HashMap<Tematica, Integer> clonarHash() {
        HashMap<Tematica, Integer> hashParaPostulante = new HashMap<>();
        Iterator<Tematica> it = hashMapTematicasConNivel.keySet().iterator();
        while (it.hasNext()){
            Tematica tematica = it.next();
            int nivel = hashMapTematicasConNivel.get(tematica);
            hashParaPostulante.put(tematica, nivel);
        }
        return hashParaPostulante;
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
    
    public void agregarPuesto (Puesto unPuesto){
        this.puestos.add(unPuesto);
        System.out.println("Puesto agregada");
        notificarObservers();
    }

    public ArrayList<Entrevistador> getEntrevistadores() {
        return entrevistadores;
    }
    
    public void agregarEntrevista (Entrevista unaEntrevista){
        this.entrevistas.add(unaEntrevista);
        System.out.println("Entrevista agregada: " + unaEntrevista);
        notificarObservers();
    }

    public void agregarEntrevistador(Entrevistador entrevistadore) {
        this.entrevistadores.add(entrevistadore);
        System.out.println("entrevistador agregado");
        notificarObservers();
    }

    public ArrayList<Postulante> getPostulantes() {
        return postulantes;
    }

    public void agregarPostulante(Postulante postulante) {
        this.postulantes.add(postulante);
        System.out.println("postulante ingresado");
        notificarObservers();
    }
    
    public void eliminarUnPostulante(Postulante unPostulante){
        postulantes.remove(unPostulante);
        // elimino las entrevistas
        for(Entrevista ent : this.entrevistas){
            if(ent.getPostulante().equals(unPostulante)){
                this.entrevistas.remove(unPostulante);
            }
        }
        notificarObservers();
    }
    
    public void agregarUnaTematica(Tematica unTema){
        this.tematicas.add(unTema);
        System.out.println("tema ingresado");
        notificarObservers();
    }
    
    public void agregarAlHashMap(Tematica unTema, Integer unNivel){
        this.hashMapTematicasConNivel.put(unTema,unNivel);
        System.out.println("Agregado al HashMap");
        notificarObservers();
    }
    
    public void limpiarHashMap(){
        hashMapTematicasConNivel.clear();
        notificarObservers();
    }
    
    public ArrayList<Postulante> getPostulantesFiltradosPorNivel(ArrayList<Tematica> temasParaFiltrar, int nivelAFiltrar){
        System.out.println("enrte getPostulantesFiltradosPorNivel");
        ArrayList<Postulante> listaADevolver= new ArrayList<>();
        for(Postulante pos : this.postulantes){
            Boolean coincideTodos=true;
            HashMap<Tematica, Integer> hashDePostulante = pos.getTemas();
            for(Tematica tema : temasParaFiltrar){
                if (hashDePostulante.containsKey(tema)){
                    if (!(hashDePostulante.get(tema)>= nivelAFiltrar)){
                        coincideTodos=false;
                    }
                }else{
                    coincideTodos=false;
                }
            }
            if(coincideTodos){
                listaADevolver.add(pos);
            }
        }
        return listaADevolver;
    }
    
    public ArrayList<Postulante> getPostulantesFiltradosPorEntrevista(ArrayList<Postulante> listaAFiltrar){
        System.out.println("enrte getPostulantesFiltradosPorEntrevista");
        ArrayList<Postulante> listaADevolver= new ArrayList<>();
        for(Postulante pos : listaAFiltrar){
            for(Entrevista entre : this.entrevistas)
                if (entre.getPostulante().equals(pos)&&!(listaADevolver.contains(pos))){
                    listaADevolver.add(pos);
                }
        }
        return listaADevolver;
    }
    
    public ArrayList<Postulante> getPostulantesFiltradosPorFormato(ArrayList<Postulante> listaAFiltrar, String formatoDelPuesto){
        System.out.println("enrte getPostulantesFiltradosPorFormato");
        ArrayList<Postulante> listaADevolver= new ArrayList<>();
        for(Postulante pos : listaAFiltrar){
            if(pos.getFormato().equals(formatoDelPuesto)){
                listaADevolver.add(pos);
            }
        }
        return listaADevolver;
    }
    public ArrayList<Postulante> getPostulantesFiltradosPorEntrevistaPuntaje(ArrayList<Postulante> listaAFiltrar){
        ArrayList<Postulante> listaADevolver= new ArrayList<>();
        ArrayList<Entrevista> EntrevistasFiltradas= new ArrayList<>();
        
        // filtro para tener una lista de las entrevistas en las que hayan participado los postulantes posibles
        for(Entrevista entrevis: this.entrevistas){
            if(listaAFiltrar.contains(entrevis.getPostulante())){
                EntrevistasFiltradas.add(entrevis);
            }
        }
        // filtro la lista de entrevistas generada recien para que me queden en orden decreciente por el puntaje
        Collections.sort(EntrevistasFiltradas, new Comparator<Entrevista>() {
            @Override
            public int compare(Entrevista e1, Entrevista e2) {
                return e2.getPuntaje() - e1.getPuntaje();
            }
        });
        
        
        //ahora de esta lista de entrevistas agarro los postulantes si no estan ya en la lista(si las entrevistas estan en orden decreciente)
        //tambien lo estaran los postulantes
        for(Entrevista entrevis2 : EntrevistasFiltradas){
            if(!(listaADevolver.contains(entrevis2.getPostulante()))){
                listaADevolver.add(entrevis2.getPostulante());
            }
        }
        
        
        return listaADevolver;
    }
    
    public ArrayList<Entrevista> getPostulantesFiltradosPorEntrevistaNumeroCreciente(Postulante postulanteFiltro){
        ArrayList<Entrevista> entrevistasFiltradas= new ArrayList<>();
        
        // filtro para tener una lista de las entrevistas en las que hayan participado los postulantes posibles
        for(Entrevista entrevis: this.entrevistas){
            if(postulanteFiltro.equals(entrevis.getPostulante())){
                entrevistasFiltradas.add(entrevis);
            }
        }
        // filtro la lista de entrevistas generada recien para que me queden en orden decreciente por el puntaje
        Collections.sort(entrevistasFiltradas, new Comparator<Entrevista>() {
            @Override
            public int compare(Entrevista e1, Entrevista e2) {
                return e1.getNumeroCorrelativo()- e2.getNumeroCorrelativo();
            }
        });
        return entrevistasFiltradas;
    }
    public int cantidadDePersonasQueSabenDelTema(Tematica temaASaber){
        int cantidad=0;
        for(Postulante pos : this.getPostulantes()){
            if(pos.getTemas().containsKey(temaASaber)){
                if(pos.getTemas().get(temaASaber)>=5){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
    
    public int cantidadDePuestosQueNecesitan(Tematica temaASaber){
        int cantidad=0;
        for(Puesto pues : this.getPuestos()){
            if(pues.getTemas().contains(temaASaber)){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public Boolean verificacionCedulaPostulantes(int unaCed){
        Boolean sirve=true;
        for(Postulante pos : this.getPostulantes()){
            if(pos.getCedula()==unaCed){
                sirve = false;
            }
        }
        return sirve;
    }
    public Boolean verificacionCedulaEntrevistadores(int unaCed){
        Boolean sirve=true;
        for(Entrevistador entr : this.getEntrevistadores()){
            if(entr.getCedula()==unaCed){
                sirve = false;
            }
        }
        return sirve;
    }
    
   public void notificarObservers(){
        setChanged();
        notifyObservers();
   }
}
