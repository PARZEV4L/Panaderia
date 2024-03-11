package Trabajadores;

public class Trabajador {

    private String nombre;
    private String apellidos;
    private int CC;
    private int Edad;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Trabajador() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int cedula) {
        this.CC = cedula;
    }
}
