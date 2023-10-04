package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private Cuenta cuenta;
    private List<Cuenta> cuentas;

    public Cliente(String rut, String nombre) {
        super(rut, nombre);
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void verInformacion() {
        if (!cuentas.isEmpty()) {
           for(Cuenta cuenta:cuentas){
               System.out.println(cuenta.toString());
           }
           }else{
            System.out.println("No se ha asignado ninguna cuenta a este cliente");
        }
    }
}
