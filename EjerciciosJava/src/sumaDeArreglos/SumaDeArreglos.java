package sumaDeArreglos;

import java.util.Scanner;

public class SumaDeArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 sumaArreglos();
		
	}

	public static void sumaArreglos() {
		
		//Scanner  para la captura de datos 
		Scanner inputA = new Scanner (System.in);
		
		
		//declaracion del arreglo A 
		int arrayA[] = null;
		int arrayB[] = null;
		int arrayC[] = null;
		arrayA = new int [2];
		arrayB = new int [2];
		arrayC = new int [2];
		int arreglo1;
		int arreglo2;
		int arreglo3;
		int contador = 0;
		
		// se ingresan los valores al arreglo unidemensional 
		
		for (int rowA = 0; rowA < arrayA.length; rowA++) {
			//contador = rowA;
			System.out.println("Capturar valor arreglo A"+ rowA );// imprime y suma uno valor mas para recorrer el arreglo
			arrayA[rowA] = inputA.nextInt();	
		}
		
		int length = arrayA.length;
		
		for (int rowA = 0; rowA < length ; rowA++){ 
			//Imprimimos los valores del array 
			System.out.println("El valor en el arreglo A: "+ arrayA[rowA]);
	}
	
		// creacion de captura del arreglo b 
		for (int rowB = 0; rowB < arrayB.length; rowB++) {
			//contador = rowB;
			System.out.println("Capturar valor arreglo B"+ rowB );// imprime y suma uno valor mas para recorrer el arreglo
			arrayB[rowB] = inputA.nextInt();	
		}

		for (int rowB = 0; rowB < arrayB.length ; rowB++){ 
			//Imprimimos los valores del array 
			System.out.println("El valor en el arreglo B "+ arrayB[rowB]+ "  la posicion del arreglo" + rowB );
			
							
		}
		

		//creacion de la suma de los arreglos aun no se como sumarlos piens que debera ser declarada una variable al inicio cmo temporal
		for (int rowC = 0; rowC < arrayC.length ; rowC++){ 
			//arreglos
			arrayC[rowC] = arrayA[contador]+arrayB[contador];
			contador ++;
			System.out.println("El valor de la suma de los arreglos A y B"+ arrayC[rowC]);
			
							
		}
	}
}





