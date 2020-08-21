
public class SentenciaSwitch {
    public static void main(String[] args) {
        
        var numero = 10;
        var nuemroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                nuemroTexto = "Numero uno";
                break;
            case 2:
                nuemroTexto = "Numero dos";
                break;
            case 3:
                nuemroTexto = "Numero tres";
                break;
            case 4:
                nuemroTexto = "Numero cuatro";
                break;
            default:
                nuemroTexto = "Caso no encontrado";
        }
        
        System.out.println("Resultado: " + nuemroTexto);
    }
}
