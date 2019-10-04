package conversionDollar;

import java.util.Scanner; 

public class ConversionDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		capturaData ();
		
	}
	
	public static void capturaData () {
		/*Objetivo de la funcion: Se realiza la convercion de la dolares a moneda mexicana.
		Fecha de creacion: 16 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/

		//Declaracion de la variables.
        String DataEntrada = "";

      //Lectura de datos
        System.out.println ("Por favor Capture cualquier valor:");

        Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner

    	//inicializacion de las variables 
        DataEntrada = entradaEscaner.nextLine (); 

      //salda de resultado y calculo realizado 
        System.out.println ("Entrada recibida por teclado es: \"" + DataEntrada +"\"");

			}

	public static double calcularDollar(double pValorDollar,double pValorMexico) {
				
		double total;
		
		total = pValorDollar * pValorMexico;	
		
		return total;
		
	}
	

	public  double calcularDollar2(double pValorDollar,double pValorMexico) {
		
		double total;
		
		total = pValorDollar * pValorMexico;
		System.out.println("EL total es el siguiente " +  total);
		
		return total;
				
		
	}
	

}
