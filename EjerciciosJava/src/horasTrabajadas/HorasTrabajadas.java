package horasTrabajadas;

public class HorasTrabajadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		calculaHorasExtras(48,88);
	}

	public static void calculaHorasExtras(int pHorasTrabajadas,  int pHorasExtras) {
		
		double ValorHora;
		String pMensaje = "Tu sueldo es $ ";
		double Sueldo;
		
		
		ValorHora = 13.50;
		
		Sueldo = ValorHora * 40;
		 
		if (pHorasTrabajadas <= 40) {
			
			System.out.println(pMensaje + pHorasTrabajadas * ValorHora);
			
			
			/*try { ingresando excepciones
			resultado = dividiendo/divisor;
			
			System.out.println("el resultado de la division " +resultado);
			}
		catch (Exception e) {
			
			
			mensaje = "Se intento divir por cero " + Integer.toString(resultado)  ;
			System.out.println(mensaje);
			}
			 * 
			 */
			
		} else if(pHorasExtras <= 8) {
			System.out.println(pMensaje + ((ValorHora * 2) * pHorasExtras + Sueldo));
					
		}else if (pHorasExtras <= 80) {
			System.out.println(pMensaje + ((ValorHora * 1) * pHorasExtras + Sueldo));
			
		} else {
			System.out.println("Verificar el numero de horas con el Supervisor ");
			
		}
		
		
		
	}
}
