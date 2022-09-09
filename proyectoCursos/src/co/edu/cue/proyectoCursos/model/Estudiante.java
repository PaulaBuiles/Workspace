package co.edu.cue.proyectoCursos.model;

public class Estudiante extends Persona {
    private String puntaje;

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }
    public Estudiante(String puntaje, String nombre, String cedula) {
        /*this.puntaje = puntaje;*/
        super();
    }
}
