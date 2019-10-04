package sexoPulsaciones;

public class SexoPulsaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza el calculo de tus pulsaciones dependiendo de tu sexo.
		Fecha de creacion: 19 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/
		
		calculoPulsacion("m",20);
		
	}

	
	public static void calculoPulsacion(String pSexo, int pEdad) {
		
		String pMensaje="Tus pusaciones son ";
		
		if (pSexo == "Femenino") {
			System.out.println(pSexo + pMensaje + (220-pEdad)/10);
			
		}else {
		System.out.println(pSexo + pMensaje + (210-pEdad)/10);
		}
	}
	
	public  void calculoPulsacion2(String pSexo, int pEdad) {
		
		String pMensaje="Tus pusaciones son ";
		
		if (pSexo == "Femenino") {
			System.out.println( pMensaje + (220-pEdad)/10);
			
		}else {
		System.out.println( pMensaje + (210-pEdad)/10);
		}
	}

	
}
