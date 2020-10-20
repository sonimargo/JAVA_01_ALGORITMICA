package practica2;

import java.util.ArrayList;
import java.util.Scanner;
	
//  Imprimir Lista Hasta un Numero
public class Ejercicio30
{
		public static void main(String[] args)
		{
		   Scanner scanner = new Scanner(System.in);   
		   ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
		   
		   System.out.println("Introduce un numero ");   
		   int numeroLimite = Integer.parseInt(scanner.nextLine());
		  
		   int i=0;   
		   while (i <= numeroLimite)
		   {
			    ListaNumeros.add(i);
			    i++;
		   }
		   System.out.println("Lista de numeros: "+ ListaNumeros);
	 
		}
}

