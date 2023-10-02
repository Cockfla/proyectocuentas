package org.example;

public class Cliente{
    private String rut;
    private Cuenta cuenta;
    public Cliente(String rut){
        this.rut=rut;
    }
    public String getRut(){
        return this.rut;
    }
    public void asignarCuenta(Cuenta cuenta){
        this.cuenta=cuenta;
    }
    public void verInformacionCuenta(){
        if(cuenta!=null){
            System.out.println(cuenta.toString());
        }else{
            System.out.println("No se ha asignado ninguna cuenta a este cliente");
        }
    }
}
