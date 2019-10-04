package posicionDeArreglos;

import java.util.Scanner;

public class PosicionDeArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		posicionesArreglos();

	}

	public static void posicionesArreglos () {
		
		//Scanner  para la captura de datos 
		Scanner inputA = new Scanner (System.in);
		
		// creacion de los arreglos 
		int arrayPo [] = null;
		arrayPo = new int [10];
		int contador = 0;
		
		//llenar el arreglos
		for (int row = 0 ;row < arrayPo.length;row++) {
			System.out.println("introduce el valor ");
			arrayPo[row] = inputA.nextInt();
			
			}
		for (int row = 0; row < arrayPo.length; row++) {
			contador = row;
			System.out.println("el vlaor en la posicion  "+(contador++)+ " es " + arrayPo[row]);
			
			
		}
		
		int length = arrayPo.length;
		
	}	
	
}
