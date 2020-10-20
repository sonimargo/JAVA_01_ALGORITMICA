package practica4;

import java.util.ArrayList;
import java.util.Scanner;

// FraseAlReves
public class Ejercicio58 
{
	public static void main(String[] args) 
	{
		Scanner datoPantalla = new Scanner(System.in);
		ArrayList<String> listaPalabras = new ArrayList<String>(); 
		String texto = ""; 
		while (true)
		{
			System.out.print("Escriba una palabra: "); 
			texto = datoPantalla.nextLine();
			
			if (listaPalabras.contains(texto))
			{
				System.out.println("Palabra repetida: " + texto);
				break;
			}	
			else
				listaPalabras.add(texto);				
		}
	}
}
