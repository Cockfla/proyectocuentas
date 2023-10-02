package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ejecutivo {

    private String nombre;
    public String correo;
    List<Cuenta> cuentas;

    public Ejecutivo( String nombre,String correo){
        this.nombre=nombre;
        this.correo=correo;
        this.cuentas=new ArrayList<>();

    }

    public void agregarCuenta(String rut,String nombre,String direccion,String correo){
        String ID=rut+"-"+(cuentas.size()+1);
        Cuenta nuevaCuenta=new Cuenta(ID, nombre,rut,direccion,correo);
        cuentas.add(nuevaCuenta);
    }
    public void verCuentas(){
        for (Cuenta cuenta:cuentas){
            System.out.println(cuenta.toString());
        }
    }
}
