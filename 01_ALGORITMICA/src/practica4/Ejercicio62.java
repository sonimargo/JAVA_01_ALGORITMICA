package practica4;

import java.util.ArrayList;

// EliminaUltimoItemLista
public class Ejercicio62 
{

	public static void main(String[] args) 
	{
		ArrayList <String> listaHermanos = new ArrayList <String> ();
		listaHermanos.add("Alba");
		listaHermanos.add("Miguel");
		listaHermanos.add("Jose");
		listaHermanos.add("Damaris");
		listaHermanos.add("Jordi");
		listaHermanos.add("Abel");		
		listaHermanos.add("Daniel");
		
		printHermanos (listaHermanos);
		//System.out.println(listaHermanos.size()-1);
		removeUltimoHermano (listaHermanos);
		printHermanos (listaHermanos);
	}
	

	public static ArrayList<String> removeUltimoHermano (ArrayList<String> listaHermanos)
	{
		listaHermanos.remove(listaHermanos.size()-1);
		return listaHermanos;
	}
	
	public static void printHermanos (ArrayList<String> listaHermanos)
	{
		String texto ="";
		for ( int i = 0; i <= listaHermanos.size()-1; i++)
		{
			if (i == 0)
				texto = "[ " + listaHermanos.get(i) + " "; 
			else if (i == (listaHermanos.size()-1))
				texto = texto + listaHermanos.get(i) + " ]";
			else
				texto = texto + listaHermanos.get(i) + " ";
		}
		System.out.print(texto);
	}
		
}
