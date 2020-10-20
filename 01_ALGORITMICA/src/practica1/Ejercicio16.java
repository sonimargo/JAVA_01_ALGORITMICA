package practica1;

import java.util.Scanner;

public class Ejercicio16
{
	 public static void main(String[] args)
	 {
	 	Scanner leerDatos = new Scanner(System.in);
	 	System.out.println("Escriba un numero ");
	 	int numero = Integer.valueOf(leerDatos.nextLine());
	 	  
	 	if ( (numero % 2) == 0 )
	 	 System.out.println("El número " + numero + " es par." );
	 	else
	 	 System.out.println("El número " + numero + " es impar." ); 	 
	 }
}
