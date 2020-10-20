package practica1;

import java.util.Scanner;

// Mostrar la formula para el area de una circunferencia
public class Ejercicio10
{
 	public static void main(String[] args)
 	{
     	Scanner leerDatos = new Scanner(System.in);
     	System.out.println("Escribe el radio del circulo: ");     	     	    	    	
     	int radio = Integer.valueOf(leerDatos.nextLine());     	
     	double pi = (double) Math.PI;
     	double circunferencia = 2 * pi * radio;
     	
     	System.out.println("Circunferencia del círculo: " + circunferencia);     	
     	
     	leerDatos.close();
 	}
}

