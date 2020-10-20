package practica3;

// Parametro Mayor
public class Ejercicio44
{

	 public static void main(String[] args)
	 {
		  int num1 = 2;
		  int num2 = 8;
		  
		  System.out.println("Numeros: " + num1 + ", " + num2);
		  
		  int answer = least( num1, num2);
		  System.out.println("Menor: " + answer);
	 }
	 
	 public static int least(int number1, int number2)
	 {
		  // write program code here
		  // do not print anything inside the method
		  // method needs a return in the end
		  if ( number1 < number2 )
		   return number1;
		  else
		   return number2;
	 }
	 
	 	 
}

