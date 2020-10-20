package practica2;

import java.util.Scanner;

// Imprimir Suma de un numeros Hasta
public class Ejercicio32
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("¿Hasta que numero se hace la suma? ");
		 
		 int numeroLimite = Integer.parseInt(scanner.nextLine());
		 
		 int contador = 1;
		 int suma = 0;
		 String calculoText = "El calculo es: ";
		 
		 while (contador <= numeroLimite)
		 {
			  suma = suma + contador;
			  calculoText = calculoText + contador + " + ";
			  contador++;
		 }
		 
		 calculoText = calculoText.substring(0, calculoText.length()-3 ) + " = " + suma;
		 System.out.println(calculoText);
	 
	}
}

