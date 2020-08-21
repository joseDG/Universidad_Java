
package Clases;

public class Principal {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        persona1.nombre = "Juan";
        persona1.apellido = "Diaz";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 " + persona2);
        System.out.println("persona2 " + persona2);
        
        persona2.nombre = "Karla";
        persona2.apellido = "Diaz";
        persona2.desplegarInformacion();
    }
}
