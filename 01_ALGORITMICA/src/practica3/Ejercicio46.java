package practica3;

// Promedio
public class Ejercicio46
{
	 
	 public static void main (String [] args)
	 {
		  int num1 = 4;
		  int num2 = 3;
		  int num3 = 6;
		  int num4 = 1;
		  
		  System.out.println("Numeros: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
		  double respuesta = promedio (num1, num2, num3, num4);
		  System.out.println ("Promedio: " + respuesta);
	 }
	 
	 
	 
	 public static double promedio (int numero1, int numero2, int numero3, int numero4)
	 {
		  int suma = sum(numero1,numero2,numero3,numero4);
		  double promedio = (double)suma / 4;
		  return promedio;
	 }
	 
	 
	 public static int sum (int numero1, int numero2, int numero3, int numero4)
	 {
		  int totalSuma = numero1 + numero2 + numero3 + numero4;
		  return totalSuma;
	 }	 
}
