package practica1;

import java.util.Scanner;

public class Ejercicio20
{
	public static void main(String[] args)
	{
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Usuario: ");
    	String usuario = scanner.nextLine();
    	
    	System.out.println("Contraseña: ");
    	String pass = scanner.nextLine();
    	
    	if (usuario.equals("alex"))
    	{
    	 if (pass.equals("pato"))
    	  System.out.println("¡Ya está conectado al sistema!");
    	 else
    	  System.out.println("¡Su nombre de usuario o contraseña no es válido!");
    	 
    	}else if (usuario.equals("emily"))
    	{
    	 if (pass.equals("gato"))
    	  System.out.println("¡Ya está conectado al sistema!");
    	 else
    	  System.out.println("¡Su nombre de usuario o contraseña no es válido!");    	
    	} 
	}
}
