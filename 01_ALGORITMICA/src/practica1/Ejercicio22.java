package practica1;

import java.util.Scanner;

public class Ejercicio22
{
	 public static void main(String[] args)
	 {
		  Scanner scanner = new Scanner(System.in);
		  String contrasenaConst = "zanahoria";
		  String contrasena ="";
		  
		  while (!(contrasena.equals(contrasenaConst)))
		  {
		   System.out.println("Para salir escriba quit");
		   System.out.println("Escribe la contraseña: ");
		   contrasena = scanner.nextLine();
		 
		   if (contrasena.equals("quit"))
		    break;
		   if (contrasena.equals(contrasenaConst))
		   {
		    System.out.println("¡Correcto! ");
		    System.out.println("¡Por fin, contraseña correcta! ");
		   }
		   else
		    System.out.println("¡Incorrecto! ");   
		  }
	 }
}
