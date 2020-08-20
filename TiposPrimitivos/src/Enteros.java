//Tipos Primitivos Enteros
public class Enteros {
    public static void main(String[] args) {
        /*
        Tiopos primitivos enteros: byte, short, int, long
        */
        
        //byte
        byte numeroByte = (byte)129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        
        //short
        short numeroShort = (short)327678;
        System.out.println("Valor Short:" + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        
        //int
        int numeroInt = (int)2147483648L;
        System.out.println("Valor Short:" + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        
        //Long
        long numeroLong = 2147483647808L;
        System.out.println("Valor Short:" + numeroLong);
        System.out.println("Valor minimo long:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo long:" + Integer.MAX_VALUE);
        
    }
}
