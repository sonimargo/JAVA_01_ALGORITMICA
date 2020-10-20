package practica4;

import java.util.Scanner;

// CaractersAlReves
public class Ejercicio52 
{
	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		System.out.println("Escriba su nombre: ");
		String nombre = datoPantalla.nextLine();
		
		System.out.print("Nombre al reves: ");
		// i posicion final en el string
		int i = nombre.length()-1;
		while (i >= 0)
		{
			System.out.print(nombre.charAt(i));
			i--;
		}
	}
}
