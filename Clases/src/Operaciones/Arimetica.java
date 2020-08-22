
package Operaciones;

public class Arimetica {
    //Atributos de la clase
    int a;
    int b;
    
    //constructor vacio
    public Arimetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //constructor de sobrecarga
    public Arimetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("construcotr con argumetos");
    }
    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
