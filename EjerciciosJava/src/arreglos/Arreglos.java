package arreglos;
import java.util.Scanner;

public class Arreglos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arreglosScanner();
		//promedioValoresAlmacenados();
		promedioValoresAlmacenadosWhile();
	}

	public static void arreglos() {
		
		int arrayEnteros[]= null;
		arrayEnteros = new int [100];
		
		for (int row = 0; row < arrayEnteros.length; row++){ 
			//Agregamos valores al array 
			arrayEnteros[row] = row; 
		}

		int length = arrayEnteros.length;
	
		for (int row = 0; row < length ; row++){ 
			//Imprimimos los valores del array 
			System.out.println("El valor en el arreglo es: "+ arrayEnteros[row]); 
		}		
		
	}
	
	public static void arreglosScanner() {
	
		Scanner input = new Scanner(System.in);
		
		int arrayEnteros[]= null;
		arrayEnteros = new int [5];
		int contador = 0;
		
		for (int row = 0; row < arrayEnteros.length; row++){
			contador = row;
			System.out.println("Capturar valor"+ contador++ );
			arrayEnteros[row] = input.nextInt();
		}

		int length = arrayEnteros.length;
	
		for (int row = 0; row < length ; row++){ 
			//Imprimimos los valores del array 
			System.out.println("El valor en el arreglo es: "+ arrayEnteros[row]); 
		}
	}


	public static void promedioValoresAlmacenados () {
		
		Scanner entradaInput = new  Scanner(System.in);
		
		int arrayPromedio[] = null;
		arrayPromedio = new int [10];
		int suma = 0  ;
		int promedio;
		int calificaciones;
		String mayorPromedio = "";
		int contador = 0;
		
		for(int row = 0; row < arrayPromedio.length; row++) {
			//llenar el arreglo
			System.out.println("Ingresar el valor");
			arrayPromedio[row] = entradaInput.nextInt();
		
			suma = suma + arrayPromedio[row];	
			
		}
		
		promedio = suma / arrayPromedio.length;
	
		
		for (int x = 0; x < arrayPromedio.length; x++ ) {
			
			if (arrayPromedio[x] > promedio) {
				
				//leer la informacion dentro del arreglo 
				if (x < arrayPromedio.length -1 ) {
				mayorPromedio = mayorPromedio + arrayPromedio[x] + ",";
				
				}else {
					mayorPromedio = mayorPromedio + arrayPromedio[x];
					
				}
				
				contador++;
			 
			}
			
		
			
		} 
		
		System.out.println("EL promedio es " + promedio);
		System.out.println("Lo valores mayores al promedio son " + contador);
		System.out.println("Datos mayores al promedio " + mayorPromedio);	
		
	}
	
	public static void promedioValoresAlmacenadosWhile () {
		
		Scanner entradaInput = new  Scanner(System.in);
		
		int arrayPromedio[] = null;
		arrayPromedio = new int [10];
		int suma = 0  ;
		int promedio;
		int calificaciones;
		String mayorPromedio = "";
		int contador = 0;
		int row =0;
		int x =0;
		
		//for(int row = 0; row < arrayPromedio.length; row++) {
			//llenar el arreglo
			
		while(row < arrayPromedio.length){
			System.out.println("Ingresar el valor");
			arrayPromedio[row] = entradaInput.nextInt();
			
		
			
			suma = suma + arrayPromedio[row];	
			row++;
			
		}
		
		promedio = suma / arrayPromedio.length;
		System.out.println("EL promedio es " + promedio);
		
		//for (int x = 0; x < arrayPromedio.length; x++ ) 
		
		do {
			//System.out.println("valor de x" + x);
			if (arrayPromedio[x] > promedio) {
				
				//leer la informacion dentro del arreglo 
				if (x < arrayPromedio.length -1 ) {
				mayorPromedio = mayorPromedio + arrayPromedio[x] + ",";
				
				}else {
					mayorPromedio = mayorPromedio + arrayPromedio[x];
					
				}
				
			
				contador++;
			}
			
			x++;	
		}while (x < arrayPromedio.length);
			
		/*	if (arrayPromedio[x] > promedio) {
				
				leer la informacion dentro del arreglo 
				if (x < arrayPromedio.length -1 ) {
				mayorPromedio = mayorPromedio + arrayPromedio[x] + ",";
				
				}else {
					mayorPromedio = mayorPromedio + arrayPromedio[x];
					
				}
				
				x++;
				contador++;
			
			}*/ 
			
			System.out.println("EL promedio es " + promedio);
			System.out.println("Lo valores mayores al promedio son " + contador);
			
			if(mayorPromedio != "") {
				
				System.out.println("Datos mayores al promedio " +mayorPromedio);	
			}
		
		} 
		
		
		
	}

	
	
	
	
	
	
