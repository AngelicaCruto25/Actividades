package projets_practic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calcular_cambio {

		
		
		
		static int [] contador;
		static int debo=0;
		private static Object Input;
		public static void main(String[] args) {
			int cambio=0;
			contador = new int[4];
					
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduzca numero de filas: ");
			int cambios = sc.nextInt();
			sc.close();
				
			debo=cambio;
		
	
			
			Mod();
System.out.println("\t Monedas de 25 \t Monedas de 10 \t  Monedas de  5\t Monedas de  1");
muestramecontador();		
		}
		public static void muestramecontador()
		{
			int aux;
			
			for(aux=0;aux<4;aux++)
			{
				System.out.print("\t| \t"+contador[aux]);
			}
		}
		public static void Mod()
		{
		
			if(debo>24)
		      {
				contador[0]=debo/25;
				debo=debo%25;
		      }
			if(debo>9)
		      {
				contador[1]=debo/10;
				debo=debo%10;
		      }
			if(debo>4)
		      {
				contador[2]=debo/5;
				debo=debo%5;  
		      }
			if(debo>1)
		      {
				contador[3]=debo/1;
				debo=debo%1;
		      }
		}

	}

