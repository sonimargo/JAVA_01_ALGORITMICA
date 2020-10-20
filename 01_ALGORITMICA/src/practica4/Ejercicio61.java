package practica4;

import java.util.ArrayList;

//Crear método public static int countItems (ArrayList <String> list) 
//Que devuelve el número de elementos de la lista. No imprimir nada. 
//El metodo solo el número 

public class Ejercicio61 
{

	public static void main(String[] args) 
	{
		ArrayList <String> listaPalabras = new ArrayList <String> ();
		listaPalabras.add("Pascal ");
		listaPalabras.add("C# ");
		listaPalabras.add("Java ");
		listaPalabras.add("PL SQL ");
		listaPalabras.add("Phyton");		
		listaPalabras.add("C++");
		listaPalabras.add("Ruby");
		printCantidadLenguajes (listaPalabras);		
		printLenguajes (listaPalabras);
				
		removeLenguaje(listaPalabras,0);
		printCantidadLenguajes (listaPalabras);
		printLenguajes (listaPalabras);		 
	}
	
	
	
	public static int contadorDeItems (ArrayList<String> listaPalabras)
	{
		if (listaPalabras.isEmpty())
			return 0;
		else
			return listaPalabras.size();		
	}

	public static void printCantidadLenguajes (ArrayList<String> listaPalabras)
	{
		System.out.println ("Hay tantos elementos en la lista: " + contadorDeItems(listaPalabras));		
	}	
	
	public static void printLenguajes (ArrayList<String> listaPalabras)
	{
		for ( String palabra : listaPalabras)
		{
			System.out.println(palabra);
		}
	}
	
	public static ArrayList<String> removeLenguaje (ArrayList<String> listaPalabras, int indexLenguaje)
	{
		listaPalabras.remove(indexLenguaje);
		return listaPalabras;
	}
		
}
