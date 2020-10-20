package practica3;

// ParametroMayor
public class Ejercicio45
{
	 
	 public static void main(String[] args)
	 {
		  int num1 = 1;
		  int num2 = 7;
		  int num3 = 7;
		  
		  System.out.println("Numeros: " + num1 + ", " + num2+ ", " + num3);
		  int answer = greatest(num1, num2, num3);
		  System.out.println("Greatest: " + answer);
	 }
	 
	 public static int greatest(int number1, int number2, int number3)
	 {
		  int result = 0;
		  if (( number1 >= number2) && (number1 >= number3))
		   result = number1;
		  else if (( number2 >= number1) && (number2 >= number3))
		   result = number2;
		  else if (( number3 >= number1) && (number3 >= number2))
		   result = number3;
		  
		  return result;
	 }	 
}
