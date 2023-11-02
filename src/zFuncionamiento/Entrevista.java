package zFuncionamiento;

public class Entrevista {
    private Entrevistador entrevistador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    private int numeroCorrelativo;

    public Entrevista(Entrevistador entrevistador, Postulante postulante, int puntaje, String comentarios, int numeroCorrelativo) {
        this.entrevistador = entrevistador;
        this.postulante = postulante;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
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
    
    public String comentarioConColor(String palabraABuscar){
        String textoAMostrar="";
        String[]arrayDeComentarios = this.getComentarios().split(" ");
        for (int i = 0; i < arrayDeComentarios.length; i++) {
        if (arrayDeComentarios[i].equals(palabraABuscar)) {
            // Si la palabra coincide, aplicamos el formato HTML para color rojo
            textoAMostrar += "<font color='red'>" + arrayDeComentarios[i] + "</font> ";
        } else {
            // De lo contrario, simplemente agregamos el texto en negro
            textoAMostrar += arrayDeComentarios[i] + " ";
        }
    }
    
    return "<html>" + textoAMostrar + "</html>";
    }
    
}
