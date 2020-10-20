package practica1;

import java.util.Scanner;

public class Ejercicio19
{
	public static void main(String[] args) 
	{
 
		Scanner leerDatos = new Scanner(System.in);
    	System.out.println("¿Cuantos años tienes? ");
    	int edad = Integer.valueOf(leerDatos.nextLine());
    	
    	if (edad < 0 || edad > 120)
            	System.out.println("¡Imposible! ");
    	else
        	System.out.println("¡Correcto! ");    	    	
	}
}

