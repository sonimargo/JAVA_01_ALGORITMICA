package practica4;

import java.util.Scanner;

// PolindromeConReverse
public class Ejercicio69 
{
	
	public static void main(String[] args) 
	{
		Scanner datosPantalla = new Scanner(System.in); 
		System.out.println("Escriba un texto: "); 
		String texto = datosPantalla.nextLine(); 

		if (palindrome(texto)) 
		{ 
			System.out.println("El texto es un palindrome!"); 
		} 
		else 
		{ 
			System.out.println("El texto NO es un palindrome!"); 
		} 
	}
	
	
	
	public static String reverse(String texto) 
	{ 
		int i = texto.length()-1;
		String textoAlReves = "";
		
		while (i >= 0)
		{
			textoAlReves = textoAlReves + texto.charAt(i);
			i--;
		}
		return textoAlReves; 
	} 
	
	public static boolean palindrome (String texto)
	{	
		return reverse(texto).equals(texto);
	}
	
}

