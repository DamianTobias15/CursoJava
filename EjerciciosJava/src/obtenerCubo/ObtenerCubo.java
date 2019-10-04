package obtenerCubo;
import java.util.Scanner;

public class ObtenerCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza el calculo del numero ingresado el cubo y su cuarta potencia.
		Fecha de creacion: 23 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/
		
		cuboPotencia();

	}
	
	public static void cuboPotencia() {
		
		Scanner input = new Scanner(System.in);
		
		int salida = 0 ;
		int valor;
		int cubo ;
		int cuarta;
			
		for(valor = 0; valor <=5; valor++) {
			cubo = valor*valor*valor;
			cuarta = valor*valor*valor*valor;
			System.out.println("Introduce el valor " + valor );
				
		}
		
		
		
		
	}

}
