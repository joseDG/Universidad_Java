
public class Flotantes {
    public static void main(String[] args) {
        /*
        Tipos primitivos flotante: float  y double
        */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numero Float: " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDoble = 1.7976931348623157E308;
        System.out.println("numero Double: " + numeroDoble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
    }
}
