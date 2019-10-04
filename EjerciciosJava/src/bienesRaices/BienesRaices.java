package bienesRaices;

public class BienesRaices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza el calculo a pagar en bienes raices
		Fecha de creacion: 19 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/
		
		calculaPago(5000,80000);
		
	}
	
	public static void calculaPago (double pIngresos, double pTotal) {
		
		String pMensaje ="El costo total es $";
		
		if (pIngresos  < 8000) {
			System.out.println(pMensaje + (((pTotal*.15) - pTotal)/120)*-1);		
						
		}else {
			
			System.out.println(pMensaje + (((pTotal*.30)- pTotal)/72)*-1);
		}
		
		
		
	}

}
