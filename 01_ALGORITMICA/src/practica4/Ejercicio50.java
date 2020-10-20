package practica4;

import java.util.Scanner;

// _MostrarVariosCaracteres
public class Ejercicio50 
{
	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = datoPantalla.nextLine();
		
		int i =0;
		while (i < 3)
		{
			//char caracter = nombre.charAt(0);
			System.out.println((i+1) +". Caracter: "+ nombre.charAt(i));
			i++;		
		}
	}
}
