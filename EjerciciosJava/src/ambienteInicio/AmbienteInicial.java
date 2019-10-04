package ambienteInicio;

public class AmbienteInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primer script en java");
		int suma;
		int a,b;
		String mensaje1,mensaje2,mensaje3;
		mensaje1 = "El valor de las variable A es = ";
		mensaje2 = " Mas el valor de la variable B es = ";
		mensaje3 =	" EL resultado de la suma de A+B es ";	
		a=5;
		b=9;
		suma = a+b;
		
		System.out.println("El valor de las variable A es = " + a + " Mas el valor de la variable B es = " + b + " EL resultado de la suma de A+B es "+suma);
		System.out.println(mensaje1 + a + mensaje2+ b + mensaje3+suma);
	}

}
