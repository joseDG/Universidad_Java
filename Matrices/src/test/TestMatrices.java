package test;

public class TestMatrices {

    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        System.out.println("edades: " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        /*System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-0 = " + edades[0][1]);
        System.out.println("edades 0-0 = " + edades[1][0]);
        System.out.println("edades 0-0 = " + edades[1][1]);*/
        
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        //[3] filas
        //[2] columnas
        String frutas[][] = {{"naranja","limon"},{"fresa","Zanahoria","Mora"}};
        for (int fila = 0; fila < frutas.length; fila++) {
            for (int col = 0; col < frutas[fila].length; col++) {
                System.out.println("frutas " + fila + col + ":" + frutas[fila][col]);
            }
        }
        
       /* Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);*/

    }
    /*
    public static void imprimir(Object matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[fila][col]);
            }
        }
    }*/
}
