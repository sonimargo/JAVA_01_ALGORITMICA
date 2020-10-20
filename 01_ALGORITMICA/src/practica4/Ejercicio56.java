package practica4;

import java.util.Scanner;

// CaractersAlRevesMetodo
public class Ejercicio56 
{
	public static String reverse(String texto) 
	{ 
		int i = texto.length()-1;
		String textoTmp = "";
		
		while (i >= 0)
		{
			textoTmp = textoTmp + texto.charAt(i);
			i--;
		}
		return textoTmp; 
	} 

	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		System.out.print("Escriba un texto: "); 
		String texto = datoPantalla.nextLine(); 
		System.out.println("Al reves: " + reverse(texto)); 
	}
}
