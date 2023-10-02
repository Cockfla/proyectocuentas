package org.example;

public class Main {
    public static void main(String[] args) {
       Ejecutivo ejecutivo= new Ejecutivo("Elias","123@gmail.com");

       ejecutivo.agregarCuenta("21.315.211-4","Andrés","anashe","3@gmail.com");
       ejecutivo.agregarCuenta("20.659.872-7","María Jesús","si","2@gmail.com");
      // ejecutivo.verCuentas();

       System.out.println("----------------------------");

       Cliente cliente1= new Cliente("33333-3");
       cliente1.asignarCuenta(ejecutivo.cuentas.get(0));
       Cliente cliente2= new Cliente("939239-3");
       cliente2.asignarCuenta(ejecutivo.cuentas.get(1));

       System.out.println("----------------------------");

       cliente1.verInformacionCuenta();
       cliente2.verInformacionCuenta();

    }
}