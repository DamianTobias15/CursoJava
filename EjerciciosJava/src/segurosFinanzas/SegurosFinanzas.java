package segurosFinanzas;

public class SegurosFinanzas {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza un descuento a los usuarios que elejan un numero mayor a 74 se aplicara un descuento total.
		Fecha de creacion: 19 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/

		calculaSeguro(55000);
	}
	
	public static void calculaSeguro(double pMonto) {
		
		String  pMensaje = "El monto a pagar es $ ";
		
		if (pMonto >50000) {
			
			System.out.println(pMensaje + ((pMonto * .2)- pMonto )*-1);
			
		}else {
			System.out.println(pMensaje + ((pMonto * .3)- pMonto)* -1);
			
		}
		
	}

}
