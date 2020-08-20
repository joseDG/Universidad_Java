
public class OperadoresCondicionales {
    public static void main(String[] args) {
        
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;
        
        //operador 
        if(resultado){
            System.out.println("Dentro del Rango");
        }else{
            System.out.println("Fuera del Rango");
        }
        
        //opereador or
        var vacaciones = false;
        var descanso = false;
        
        if(vacaciones || descanso){
            System.out.println("Padre puede asistir al juego");
        }else{
            System.out.println("Padre esta ocupado");
        }
                
        
    }
}
