package arregloCuadrado;

import java.util.Scanner;

public class ArregloCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arryCuadrado();
		
	}
	
	public static void arryCuadrado() {
		
		Scanner entrada = new Scanner(System.in);
		//creacion del arreglo 
		int arrayCua []=null;
		arrayCua = new int [5];
		int contador = 0;
		
		//llenar el arreglos
		for (int row = 0 ;row < arrayCua.length;row++) {
		System.out.println("introduce el valor ");
		arrayCua[row] = entrada.nextInt();
		
		}
	
		for (int row = 0; row< arrayCua.length;row++) {
			contador = arrayCua[row]* arrayCua[row];
			System.out.println("el cuadrado es "+ contador + " de "+ arrayCua[row] );
			
		}
	
		int length = arrayCua.length;
	}
	
 
}
