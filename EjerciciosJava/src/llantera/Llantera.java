package llantera;

import java.util.Scanner;

public class Llantera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		capturaData();
		calculaLlanta(9);
		
	}

	public static void capturaData () {
		/*Objetivo de la funcion: Se realiza el claculo a pagar si su compra es mayor a 7 llantas se aplicara un descuento.
		Fecha de creacion: 19 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/

		//Declaracion de la variables.
        String DataEntrada = "";

      //Lectura de datos
        System.out.println ("Por favor Capture las llantas a comprar");

        Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner

    	//inicializacion de las variables 
        DataEntrada = entradaEscaner.nextLine (); 

     

			}
	public static void calculaLlanta(int pLlantas ){
		
	   String pMensaje = "El costo total es $ ";
	
		
		if (pLlantas>5) {
		System.out.println(pMensaje + (pLlantas )* 700 );
			
		}else {
			System.out.println(pMensaje + (pLlantas)* 800);
			
		}
		
		
		
	} 
	
	
}
