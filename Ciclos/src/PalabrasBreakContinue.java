
public class PalabrasBreakContinue {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 3; i++) {
            if(i %2 == 0){
                System.out.println("contador " + i);
                //break; //termina el ciclo
            }
        }
        */
        inicio: //se llaman etiquetas sirven 
         for (int i = 0; i < 3; i++) {
            if(i %2 != 0){
                continue inicio; //ir ala sigueinte iteracion
            }
            System.out.println("contador " + i);
        }
    }
 
}
