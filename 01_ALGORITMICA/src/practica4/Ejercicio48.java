package practica4;

import java.util.Scanner;

// PrimerCaracter
public class Ejercicio48 
{
	public static void main(String[] args) 
	{		
		Scanner datoPantalla = new Scanner(System.in);
		System.out.println("Introduce palabra: ");		
		
		char primercaracter = firstCharacter(datoPantalla.nextLine());
		System.out.println("Su primera letra: "+ primercaracter);
	}

	public static char firstCharacter (String text)
	{
		return text.charAt(0);				
	}
	
}
