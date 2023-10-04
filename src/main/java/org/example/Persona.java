package org.example;

import org.example.interfaces.IPersona;

public class Persona implements IPersona {
    private String rut;
    private String nombre;
    public Persona(String rut, String nombre){
        this.rut=rut;
        this.nombre=nombre;
    }

    @Override
    public void VerInformacionCuenta(){
        System.out.println(rut);
        System.out.println(nombre);
    }
}
