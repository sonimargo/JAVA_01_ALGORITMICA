package practica1;

import java.util.Scanner;

// Es mayor de edad?
public class Ejercicio15
{
	public static void main(String[] args)
	{
	 Scanner leerDatos = new Scanner(System.in);
    	System.out.println("¿Cuantos años tienes ?");
    	int edad = Integer.valueOf(leerDatos.nextLine());
    	
    	if (edad > 17)
    	 System.out.println("Eres mayor de edad");
    	else
    	 System.out.println("Eres menor de edad");
	}
}
