package co.edu.cue.enums.model;

public class Teacher {
    private String name;
    private String edad;
    private String cc;
    private String salario;
    private String clases;

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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public Teacher(String name, String edad, String cc, String salario, String clases) {
        this.name = name;
        this.edad = edad;
        this.cc = cc;
        this.salario = salario;
        this.clases = clases;
    }
}
