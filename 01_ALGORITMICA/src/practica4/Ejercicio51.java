package practica4;

import java.util.Scanner;

// MostrarTodosCaracteres
public class Ejercicio51 
{
	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		System.out.println("Escriba su nombre: ");
		String nombre = datoPantalla.nextLine();
		
		int i= 0;
		while (i < nombre.length())
		{
			System.out.println((i+1)+". Caracter: " + nombre.charAt(i));
			i++;
		}
	}
}
