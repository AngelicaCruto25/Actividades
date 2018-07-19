package projets_practic;

import java.util.Scanner;

public class Agua_botellas {
	public static void main(String[] args) {
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuanto tiempo tardas en bañarte: ");
		int tiempo = sc.nextInt();
		sc.close();
		
		resultado = tiempo*12;
		System.out.println("desperdicias " + resultado + " botellas de agua por " + tiempo + " minutos de ducha " );

}
}
