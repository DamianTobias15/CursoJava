package excepciones;

public class Excepciones {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divir(5,0);
	
	}

	public static  void divir (int dividiendo, int divisor) {
		
		int resultado;
		String mensaje;
		
		resultado = 0;
		
		try {
			resultado = dividiendo/divisor;
			
			System.out.println("el resultado de la division " +resultado);
			}
		catch (Exception e) {
			
			
			mensaje = "Se intento divir por cero " + Integer.toString(resultado)  ;
			System.out.println(mensaje);
			}
		
		/*finally {
			
			System.out.println("Ocurrio un error en la division: el resultado es = "+ resultado);
		}
		*/
		
		
	}
}

