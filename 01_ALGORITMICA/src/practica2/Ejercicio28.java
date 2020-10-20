package practica2;

import java.util.ArrayList;
import java.util.Collections;

// Imprimir Lista ordenda al reves
public class Ejercicio28
{
	 public static void main(String[] args)
	 {	 
		ArrayList<Integer> lista = new ArrayList<Integer>();
	 	 
	 	System.out.println("Llenar lista");
	 	for (Integer i= 0; i < 100; i++)
	 	{
		 	  //System.out.println("Valor " + (i+1));
		 	  lista.add(i+1);
	 	}
	 	Collections.sort(lista);
	 	Collections.reverse(lista);
	 	
	 	System.out.println("Lista de numeros enteros");
	 	for (Integer numerolista : lista )
	 		System.out.print(numerolista+", ");	
	 } 
}
