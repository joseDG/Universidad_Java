
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {
    public static void main(String[] args) {
        int variable = 10;
        System.out.println(variable);
        //Modificamos la variable
        variable = 5;
        System.out.println(variable);
        
        //Variables String
        String miVariableCadena  = "Saludos";
        System.out.println(miVariableCadena);
        //Modificamos la variable
        miVariableCadena  = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencias de tipos en Java
        var miVariableEntera = 10;
        
        //Concatenacion de Variables
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);
        
        //Concatenacion con numeros y Strings
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        
        //caracteres especiales
        var nombre = "Karla";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t " + nombre);
        System.out.println("Retroceso: \b\b " + nombre);
        System.out.println("Comillas Simple: \'" + nombre + "\'");
        System.out.println("Comilla Doble: \"" + nombre + "\"");
        
        //Creacion de la clase de Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        var usuario1 = entrada.nextLine();
        System.out.println("Usuario = " + usuario1);
        
        System.out.println("Escribe el titulo: ");
        var titulo1 = entrada.nextLine();
        System.out.println("Titulo = " + titulo1);
        
        
    }
}
