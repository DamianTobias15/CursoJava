package porcentajePresupuesto;

import java.util.Scanner; 

public class PorcentajePresupuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza el calculo del presupuesto de diferentes areas.
		Fecha de creacion: 16 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/	
		
		capturaData2();
	}
	
	
	
	 public static void capturaData () {


         String DataEntrada = "";

         System.out.println ("Por favor Capture cualquier valor:");

         Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner

         DataEntrada = entradaEscaner.nextLine (); 

         System.out.println ("Entrada recibida por teclado es: \"" + DataEntrada +"\"");

	 }	
	 

	 public static String  calculaPresupuesto3(double pPresupuesto,double pPorcentaje,String pMensaje) {
			
			double presupuestoAsignado;
			
			presupuestoAsignado = pPresupuesto * ( pPorcentaje/100);
			
			
			return pMensaje + " " +  presupuestoAsignado + "$";
		 
	 }
	 
	 public static void capturaData2 () {

		

         String Presupuesto;
         String Porcentaje;
		 String Mensaje = "";

		 
		 // es una captura de lo que estare capturando
         Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner
         
         System.out.println ("Por favor Capture el presupuesto");
         
         Presupuesto = entradaEscaner.nextLine ();
         System.out.println ("Por favor Capture el porcentaje asignado");
         
         Porcentaje =  entradaEscaner.nextLine();
         System.out.println ("Captura el mensaje para el area");
         
         Mensaje 	= 	entradaEscaner.nextLine();

         //Se muestra el resultado de la operacion 
         System.out.println (calculaPresupuesto3( Double.parseDouble(Presupuesto), Double.parseDouble(Porcentaje) , Mensaje) );

        
         
	 }
	 

}
