package descuentosTienda;

public class DescuentosTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza un descuento a los usuarios que elejan un numero mayor a 74 se aplicara un descuento total.
		Fecha de creacion: 19 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/

		calculaDescuento(0,5000);
		
	}

	public static void calculaDescuento(int pNumero, double pTotal) {
		
		String pMensaje = "EL costo total de su cuenta es $";
		
		if (pNumero > 74)  {
			
			System.out.println(pMensaje+ ((pTotal *.20 )- pTotal)*-1);
			
		}else {
			System.out.println(pMensaje + ((pTotal *.15 )- pTotal)*-1);
			
		}
		
		
	}
	
}
