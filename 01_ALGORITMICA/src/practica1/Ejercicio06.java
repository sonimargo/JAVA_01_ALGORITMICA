
package practica1;

import java.util.Scanner;

// Imprimir la suma de dos numeros 
public class Ejercicio06
{
		public static void main(String[] args)
		{
		 Scanner leerDatos = new Scanner(System.in);
		 
		 System.out.println("Introduce primer numero a sumar ");	 
		 int numero1 = Integer.parseInt(leerDatos.nextLine());
		 
		 System.out.println("Introduce segundo numero a sumar ");	 
		 int numero2 = Integer.parseInt(leerDatos.nextLine());
		 
		 System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1+numero2));
		}
}