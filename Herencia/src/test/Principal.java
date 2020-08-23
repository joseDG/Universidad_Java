package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 500.0);
        System.out.println("empelado " + empleado1);
        
        /*
        var fecha = new Date();
        Cliente cliente = new Cliente(fecha, true, "Karla", 'F', 28, "Cuenca y pasaje");
        System.out.println("cleinte" + cliente);*/

    }
}
