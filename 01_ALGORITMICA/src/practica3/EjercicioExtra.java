package practica3;

import java.util.ArrayList;
import java.util.Scanner;

// Perimetro meetodos estaticos
public class EjercicioExtra 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	String perimetroStr = "";
    	int perimetro = 0;
    	
    	while (perimetroStr != "quit")
    	{
	    	System.out.println("Per sortir quit");
	    	System.out.println("Perimetre de: Q - quadrat, R - rectangle, T - triangle? ");
	    	perimetroStr = scanner.nextLine();
	    	    	
	    	if (perimetroStr.equals("Q"))
	        	perimetro = perimetreQuadrat();
	    	
	    	else if (perimetroStr.equals("R"))
	    		perimetro = perimetreQuadrat();
	    	
	    	else if (perimetroStr.equals("T"))
	    		perimetro = perimetreTriangle();
	    	
	    	else if (perimetroStr.equals("quit"))
	    			break;
	    	System.out.println("El area de un " + perimetroStr + " es " + perimetro);
	    	System.out.println("");
    	}    	
    }

    
    
    public static Integer SolititarNumerosPorPantalla(String texto)
    {    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println(texto);
    	return Integer.parseInt(scanner.nextLine());
    }

    
    public static int perimetreQuadrat()
    {
    	// Base * altura (quadrat i rectangle)
       	Integer base = SolititarNumerosPorPantalla("Base: ");
       	Integer altura = SolititarNumerosPorPantalla("Altura: ");        	
    	
       	Integer perimetro = base * altura;
       	
    	return perimetro;
    }

    
    
    public static int perimetreTriangle()
    {
    	// Lado 1 + lado 2 + lado 3
       	Integer lado1 = SolititarNumerosPorPantalla("Lado 1: ");
       	Integer lado2 = SolititarNumerosPorPantalla("Lado 2: ");        	
       	Integer lado3 = SolititarNumerosPorPantalla("Lado 3: ");
       	
       	Integer perimetro = lado1 + lado2 + lado3;
       	
    	return perimetro;

    }
}


