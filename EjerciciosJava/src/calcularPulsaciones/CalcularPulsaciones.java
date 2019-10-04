package calcularPulsaciones;

import java.util.Scanner;

public class CalcularPulsaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Calcula las pulsaciones que una persona con respecto a su edad.
		Fecha de creacion: 16 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/

		capturaData();
	
		
		
		
	}
	
	public static void capturaData (){
		
		// Declaracion de las variables del Metodo
			String Edad;
			int Pulso;
			
		//Opraciones del calculo 
		//num. pulsaciones = (220 - edad)/10

	
	        System.out.println ("Introduce tu edad");

	        Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner

	        Edad = entradaEscaner.nextLine (); 
	     
	      //Operaciones   
	        Pulso=(Integer.parseInt(Edad)-220)/10*-1;
	        
	      //Se impre el resultado del calculo   
	        System.out.println ("Numero de pulsaciones por cada 10 segundos  \"" + Pulso +"\"");	
	      
	        
	     
	        
	        
	}

	public static double  calculaPulsaciones( double pEdad, String pMensaje) {
		// Se realiza la creaciòn de un metodo que realiza el calculo de las pulsaciones por cada 10 segundo
		
		// Declaraciòn de la variables del metodo
		double pulsaciones;
		
		//Operaciones de el calculo de las pulsaciones
		 pulsaciones = pEdad-220/10;
		
		 
		 // El metodo retorna el resultado de las pulsaciones e imprime un mensaje 
		 return pulsaciones;
		 
	}
	

}
