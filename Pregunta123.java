import java.util.Scanner;

public class Pregunta123 {
    
    public static void main (String [] args) {
        
        Scanner entrada = new Scanner (System.in);
        int opcion;
        boolean respuesta = true;

    System.out.println("Cual de estas 3 opciones es un animal:\n 1.- Un gato\n 2.- Un libro\n 3.- Una lampara");

    System.out.println("Ingrese la opcion solictada");
    opcion = entrada.nextInt();

    while (respuesta) {
    if( opcion == 1 ) {
    System.out.println("Respuesta correcta");  
    respuesta = false;
    } 
    else {
        System.out.println("Respuesta incorrecta, intente nuevamente");
        respuesta = true;
    }
}
	}
}
