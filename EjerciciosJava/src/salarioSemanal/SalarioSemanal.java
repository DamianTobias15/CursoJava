package salarioSemanal;

import java.util.Scanner;

public class SalarioSemanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sueldoSemanal();
	
	}


	public static void sueldoSemanal() {
		
		Scanner input = new Scanner (System.in);
		int entrada;
		
		
		System.out.println("ingresar horas");
		entrada = input.nextInt();
		
		
		while (entrada <= 40) {
			System.out.println("Tu sueldo" + entrada);
			entrada++;
		}
		
	}
}

