package numerosPostivos;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numerosPositivos();
	}

	
	public static void numerosPositivos () {
		
		Scanner positivo = new Scanner(System.in);
		
		int Positivo =0;
		int contador ;
		
		for (int i =0;i<=5;i++) {
			System.out.println("Introduce un numero "+ i++);
			Positivo = positivo.nextInt();
			
			
			if (Positivo > 1) {
				contador = Positivo;
				System.out.println("EL valor es positivo "+" " + contador +Positivo);
				
				}
			
			
			
		}
				
	}
}
