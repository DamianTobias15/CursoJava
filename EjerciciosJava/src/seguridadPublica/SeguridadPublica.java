package seguridadPublica;
import java.util.Scanner;


public class SeguridadPublica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcomania ();

	}
	
	public static void calcomania () {
		
		int  input = 0;
		int placas =0 ;
		Scanner Entrada = new Scanner (System.in);
		
		System.out.println("Escribe el numero final de la placa"+ placas);
		input = Entrada.nextInt();
		
		while (placas >= 0) {
			if (input == 1 ) {
				System.out.println("Su calcomania es Amarilla"+ placas);
			
			}else if (input == 3 ) {
				System.out.println("Su calcomania es Rosa"+ placas);
				
			}else {
					System.out.println("Su calcomania es Roja"+ placas);
				
			}
			
			
		}
		
		placas++;
		
	}

}
