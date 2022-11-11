import java.util.Scanner;

public class InformacionPasante2 {

	public static void main (String [] args) {
        
        Scanner entrada = new Scanner (System.in);

        int StudentAge = 36;
        double Prom = 8.6;
        String Midlename = "Rocio";
        String name = "Cecilia";
        String lastname = "Antezana";
        char Firstinitial = 'C';
        char lastinitial = 'A';
        boolean Attendance = true;

    System.out.println("Ingrese el apellido");
    lastname = entrada.nextLine();
    System.out.println("Ingrese el nuevo promedio");
    Prom = entrada.nextDouble();
    

	System.out.println ("\nLa edad del estudiante es: " + StudentAge +
                        "\nEl promedio es: " + Prom +
                        "\nEl nombre es: " + Midlename +
                        "\nLa primera inicial es: " + Firstinitial + 
                        "\nLa ultima inicial es: " + lastinitial +
                        "\nLa participacion es: " + Attendance +
                        "\nEl nombre es: " + name +
                        "\nEl apellido  es: " + lastname);
	
	}
	


}
