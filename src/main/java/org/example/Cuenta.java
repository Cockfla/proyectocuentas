package org.example;

public class Cuenta {
    private String ID;
    private String nombre;
    private String rut;
    private String direccion;
    private String correo;

    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;

    public Cuenta(String ID, String nombre, String rut, String direccion, String correo){
        this.ID=ID;
        this.nombre=nombre;
        this.rut=rut;
        this.direccion=direccion;
        this.correo=correo;
    }

    public String getRut() {
        return rut;
    }
    @Override
    public String toString() {
        return "Número de Cuenta: " + ID + "\n" +
                "Nombre: " + nombre + "\n" +
                "Rut: " + rut + "\n" +
                "Dirección: " + direccion + "\n" +
                "Correo: " + correo;
    }
}
