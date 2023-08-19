package Eje1_Barcos;

public class Capitan {
    protected String nombre;
    protected String apellido;
    protected String matricula;

    public Capitan(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
}