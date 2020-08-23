
public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("valor de variable" + x);
        
        cambioValor(x);
        System.out.println("el valor " + x);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg = " + arg1);
        arg1 = 15;
    }
}
