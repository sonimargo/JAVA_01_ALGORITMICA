package practica4;

import java.util.Scanner;

// Longitud Nombre
public class Ejercicio47 
{
	   public static void main(String[] args) 
	   {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("Escriba su nombre ");
	    	String nombre = scanner.nextLine();   	
	    	
	    	System.out.print("Numero de caracteres: " + calculateCaracteres(nombre));
	   }
	   
	   public static int calculateCaracteres(String texto)
	   {
		   return texto.length();
	   }
}
