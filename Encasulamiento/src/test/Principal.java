package test;

import dominio.Persona;

public class Principal {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", 22.3 , true);
        //System.out.println("persona " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
        /*
        System.out.println("perosna nombre: " + persona1.getNombre());
        System.out.println("perosna sueldo: " + persona1.getSueldo());
        System.out.println("persona eliminada: " + persona1.isEliminado());*/
        
        //System.out.println("persona1 : " + persona1.toString());
        
        System.out.println("perosna1: " + persona1);

    }
}
