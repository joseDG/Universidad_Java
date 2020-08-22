
package Operaciones;

public class PruebaArimetica {
    public static void main(String[] args) {
        
        Arimetica arimetica1 = new Arimetica();
        arimetica1.a = 2;
        arimetica1.b = 5;
        arimetica1.sumar();
        
        int resultado = arimetica1.sumarConRetorno();
        System.out.println("resultado desde sumarConRetorno = " + resultado);
        
        resultado = arimetica1.sumarConArgumentos(2, 2);
        System.out.println("resultado desde sumarConArgumentos = " + resultado);
    }
}
