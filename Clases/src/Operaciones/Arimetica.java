
package Operaciones;

public class Arimetica {
    //Atributos de la clase
    int a;
    int b;
    
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
