package zFuncionamiento;

public class Entrevista {
    private Entrevistador entrevistador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    
    public Entrevista (Entrevistador unEntrevistador, Postulante unPostulante, int unPuntaje, String unosComentarios){
        this.entrevistador = unEntrevistador;
        this.postulante = unPostulante;
        this.puntaje = unPuntaje;
        this.comentarios = unosComentarios;
    }

    public Entrevistador getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(Entrevistador entrevistador) {
        this.entrevistador = entrevistador;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Entrevista{" + "entrevistador=" + entrevistador + ", postulante=" + postulante + ", puntaje=" + puntaje + ", comentarios=" + comentarios + "}";
    }
    
}
