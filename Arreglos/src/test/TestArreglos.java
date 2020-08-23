
package test;

/**
 *
 * @author Debian10
 */
public class TestArreglos {
    public static void main(String[] args) {
        
        //declaracion de un arreglo
        int edades[] = new int[3]; 
        System.out.println("arreglo =  " + edades);
        
        //editar el arreglo
        edades[0] = 10;
        System.out.println("edades " + edades[0]);
        
        //recorreindo el array
        for(int i=0; i < edades.length; i++){
            System.out.println("edades elemnto " + i + edades[i]);
        }
        
        
        
    }
}

