package practica2;

import java.util.ArrayList;
import java.util.Scanner;

// Imprimir Lista partiendo de numero inferior hasta numero superior
public class Ejercicio31 
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		 	 
		 System.out.println("Introduce numero inferior: ");
		 int numeroInferior = Integer.parseInt(scanner.nextLine());
		 
		 System.out.println("Introduce numero superior: ");
		 int numeroSuperior = Integer.parseInt(scanner.nextLine());
		 
		 if (numeroInferior < numeroSuperior)
		 {
		 	 for (int i = numeroInferior; i < numeroSuperior+1; i++)
		 	 {
		 		 listaNumeros.add(i);
		 	 }
		 	 System.out.println("Lista desde numero inferior a superior: ");
		 	 System.out.println(listaNumeros);
		 }
	}
}
