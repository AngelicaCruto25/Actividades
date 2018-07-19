package projets_practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Piramide_mirad {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader altura = new BufferedReader(
		        new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca numero de filas: ");
		int numFilas = sc.nextInt();
		sc.close();
		    
		    System.out.println();
		    {
			       
		    	for(int numBlancos = numFilas-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 1){
					//Espacios en blanco
					for(int i=1;i<=numBlancos;i++){
						System.out.print(" ");
					}
					
					//Asteriscos
					for(int j=1;j<=numAsteriscos;j++){
						System.out.print("*");
					}
		    	}
		    	
		    }
		    
		  
				
	    	}

		   
	}
