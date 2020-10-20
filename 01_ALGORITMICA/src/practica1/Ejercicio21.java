package practica1; 

import java.util.Scanner;

//Año Bisiesto
public class Ejercicio21
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
    	System.out.println("Escriba un año ");
	 int any = Integer.valueOf(scanner.nextLine());
	 
	 if ((( any % 4 == 0 ) && (any % 100  != 0)) ||  ((any % 100  == 0) && (any % 400  == 0)) )
	  System.out.println("El año es bisiesto");	 
	 else
	  System.out.println("El año NO es bisiesto");
	}
}
