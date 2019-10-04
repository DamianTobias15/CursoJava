package sumaArreglosMultidimencional;

import java.util.Scanner;

import arregloMulti.ArrayM;



public class ArraySumaMultidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayM objArrayM = new ArrayM();
		objArrayM.arreglosMulti();
		sumaArreglosMultidimencional();
	}

	public static void  sumaArreglosMultidimencional () {
		
		//crcaion del objeto scanner
		Scanner entrada = new Scanner (System.in);
		
		// creacion del arreglo
		int arrayM [][] = null;
		int arrayU [] = null;
		
		// longitud del arreglo
		arrayM = new int [5][6]; 
		arrayU = new int [6];
		
		// variable acumulador 
		int suma = 0 ;
		
		//almacenar dtos del arreglo multidimencionl 
		// almacenar el valor del row 
		for( int row=0; row  < arrayM.length; row++) {
			//almacenar el valor de colum
			for (int col = 0; col < arrayM.length; col++) {
				
				//
				System.out.println("renglon "+ row + "columna " + col);
				//se asigna al array el valor agregado 
				arrayM [row][col] = entrada.nextInt();
				// se alamacena el valor de la matris en la variable tipo acumulador 
				suma += arrayM [row][col];
				//Es la forma larga de una variable tipo acumulador 
				//suma = suma + arrayM [row][col];
				 
			
			}
		arrayU [row] =suma;
		suma = 0;
			
		}
		for (int row =0; row <arrayU.length; row++)
		System.out.println(" Suma del arreglo multidimencional "+ arrayU [row]);
		
		
	}
	
	
}
