package co.edu.cue.enums.model;

public class Student {
    private String name;
    private String edad;
    private String cc;
    private String materias;
    private String notas;

    public Student(String name, String edad, String cc, String materias, String notas) {
        this.name = name;
        this.edad = edad;
        this.cc = cc;
        this.materias = materias;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
