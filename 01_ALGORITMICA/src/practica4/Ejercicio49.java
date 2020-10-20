package practica4;

import java.util.Scanner;

// UltimoCaracter
public class Ejercicio49 
{
	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		System.out.println("Introduce palabra: ");		
		
		System.out.println("Ultima letra: " + lastCharacter(datoPantalla.nextLine()));
	}
	
	public static char lastCharacter (String text)
	{
		return text.charAt(text.length()-1);
	}
}
