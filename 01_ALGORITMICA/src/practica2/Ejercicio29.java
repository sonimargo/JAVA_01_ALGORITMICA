package practica2;

import java.util.ArrayList;

// Imprimir Lista Pares
public class Ejercicio29
{
	 public static void main(String[] args)
	 {	 
	    // Lista completa
	    ArrayList<Integer> lista = new ArrayList<Integer>();
	 	System.out.println("Lista del 1 al 100 ");
	 	
	 	for (Integer i= 0; i < 100; i++)
	 	  lista.add(i+1);
	 	System.out.println("Lista completa:  " +lista);
	 	
	 	// Lista solo con numeros pares 
	 	ArrayList<Integer> listaPares = new ArrayList<Integer>();
	 	
	 	// j El primer numero par está en la posicion 1 	
	 	int j = 1;
	 	for (Integer numeroPar : lista)
	 	{ 	 
		 	 if (j % 2 == 0)
		 	 { 
		 	  listaPares.add(numeroPar);
		 	 }
		 	 j = j + 1;
	 	} 
	 	System.out.println("Lista num.Pares: "+listaPares);
	 }
}
