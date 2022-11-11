

// 1 a =  52.1429 sem  = pagoHora * horasSemana*52.1429

import java.util.Scanner;

public class CalcularSalario {

    public static void main (String [] args) {
    Scanner entrada = new Scanner (System.in);

    double horasSemana, pagoHora, horasVacacion;

    System.out.println("\n____Calcular salario anual____");

    System.out.println("\nIngrese la cantidad de horas trabajadas por semana: ");
    horasSemana = entrada.nextDouble();
    System.out.println("\nIngrese cuanto le pagan por hora: ");
    pagoHora = entrada.nextDouble();
    System.out.println("\nIngrese cuantas horas tuvo de vacacion en 365 dias: ");
    horasVacacion = entrada.nextDouble();

    System.out.println("\nEl salario anual es: " + ((pagoHora * horasSemana*(365/7))-(horasVacacion*pagoHora)) + " $");


}

}
