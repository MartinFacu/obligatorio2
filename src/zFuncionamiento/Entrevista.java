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
    
}
