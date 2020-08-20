
import java.util.Scanner;


public class ConversionTipos {

    public static void main(String[] args) {
        
        /*
        Convertir tipo string a un tipo int
        */
        
        //var edad = "20";
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor de PI = " + valorPI);
        
        //conversion de valores
        var consola = new Scanner(System.in);
        System.out.println("Proporcioname tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        //Conversion con char
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        

    }
}
