package practica2;

import java.util.Scanner;

// SumaDesdeHasta
public class Ejercicio33B 
{
	    public static void main(String[] args) 
	    {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Numero inferior para hacer la suma: ");
	    	int numeroInferior = Integer.parseInt(scanner.nextLine());
	    	    	
	    	System.out.println("Numero superior para hacer la suma: ");
	    	int numeroSuperior = Integer.parseInt(scanner.nextLine());
	    	
	    	String texto = "La suma es: ";    	
	    	int suma = SumarNumInicioNumFin(numeroInferior,numeroSuperior,texto);
	    	
	    	System.out.println(texto + " = " + suma);
	    }
	    
	    public static int SumarNumInicioNumFin (int numero1, int numero2, String texto)
	    {
	    	int contador = numero1;
	    	int suma = 0;
	    	while (numero1 < numero2+1)
	    	{       		
	    		suma = suma + contador;
	    		System.out.println("Contador " + contador + ". Suma = " +suma);
	    		if (contador == numero2)
	    			break;
	    		texto = texto + contador + " + ";
	    		contador++;
	    	}    	
	    	return suma;
	    }
}

