package projets_practic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public interface Piramide_doble {
public static void main(String[] args) {
	
	
	int xq = 0;
	int qa = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca numero de filas: ");
	int altura = sc.nextInt();
	sc.close();
	
	for (int i = 0; i < altura; i++) {
		xq = altura - 1 - i;
	      qa = i + 2;
	      imprime_espacios(xq);
	      imprime_asteriscos(qa);
	      System.out.print(" ");
	      imprime_asteriscos(qa);
	      System.out.println("");
	    }
	  }
	  



	  public static void imprime_espacios(int e)
	  {
	    for (int aux = 0; aux < e; aux++)
	    {
	      System.out.print(" ");
	    }
	  }
	  

	  public static void imprime_asteriscos(int a)
	  {
	    for (int aux = 0; aux < a; aux++)
	    {
	      System.out.print("*");
	}
}
}
