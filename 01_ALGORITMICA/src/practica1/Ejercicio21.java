package practica1; 

import java.util.Scanner;

//A�o Bisiesto
public class Ejercicio21
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
    	System.out.println("Escriba un a�o ");
	 int any = Integer.valueOf(scanner.nextLine());
	 
	 if ((( any % 4 == 0 ) && (any % 100  != 0)) ||  ((any % 100  == 0) && (any % 400  == 0)) )
	  System.out.println("El a�o es bisiesto");	 
	 else
	  System.out.println("El a�o NO es bisiesto");
	}
}
