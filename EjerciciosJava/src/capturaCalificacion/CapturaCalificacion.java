package capturaCalificacion;

import java.util.Scanner;

public class CapturaCalificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		calculaProm();
	}	
	
	
	public static void  calculaProm() {
		
		//Se crean un objeto llamdo Valor de la clase Scanner 
		Scanner valor = new Scanner (System.in);
		
		
		
		int calf ;
		
		//asignarle lo que biien por teclado y lo transoferme en entero  
		
		
		int suma =0;
		float promedio;
		
		for (int i =1 ; i<=7;i++) {
			
			System.out.println("Ingresa la calificacion"+ ""+ i);
			//asignarle lo que biien por teclado y lo transoferme en entero  
			calf = valor.nextInt();
			
			suma = suma + calf;
		
		}
		
		promedio = suma/7;
		System.out.println("Tu calificacion es la siguiente " + promedio);
		
	}
}
