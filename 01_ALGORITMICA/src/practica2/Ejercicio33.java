package practica2;

import java.util.Scanner;

// SumaDesdeHasta
public class Ejercicio33
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Numero inferior para hacer la suma: ");
		 int numeroInferior = Integer.parseInt(scanner.nextLine());
		 	 
		 System.out.println("Numero superior para hacer la suma: ");
		 int numeroSuperior = Integer.parseInt(scanner.nextLine());
		 
		 int contador = numeroInferior;
		 int suma = 0;
		 String texto = "La suma es: ";
		 while (numeroInferior < numeroSuperior+1)
		 {
			  suma = suma + contador; 
			  if (contador == numeroSuperior)
				  break;
			  texto = texto + contador + " + ";
			  contador++;
		 }
		 System.out.println(texto.substring(1,texto.length()-2) + " = " + suma);
	}
}
