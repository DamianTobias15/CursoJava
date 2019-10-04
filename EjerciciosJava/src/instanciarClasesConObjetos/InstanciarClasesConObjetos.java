package instanciarClasesConObjetos;

import conversionDollar.ConversionDollar;
import calcularAlumnos.CalcularAlumnos;
import sexoPulsaciones.SexoPulsaciones;
import leerNumeros.LeerNumeros;
import tresNumerosLeer.TresNumerosLeer;


public class InstanciarClasesConObjetos {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/// instanciar clase 
		ConversionDollar instanciarClase = new ConversionDollar();
		CalcularAlumnos instaciarAlumnos = new CalcularAlumnos();
		SexoPulsaciones instaciarPulso =   new SexoPulsaciones();
		LeerNumeros instanciarNumero = 	   new LeerNumeros();
		TresNumerosLeer instanciaLeer =    new TresNumerosLeer();
		
		
		
		//mandar llamar el metod 
		 instanciarClase.calcularDollar2(19.00, 5000);
		 instaciarAlumnos.calculAlumno2(20,10,30);
		 instaciarPulso.calculoPulsacion2("Femenino", 30);
		 instanciarNumero.leerNuemeros(5,4);
		 instanciaLeer.calcularNumeros(9,5,3);
		
		 //obejto dejar de usuar igualar a null 
		 instanciarClase  = null;
		 instaciarAlumnos = null;
		 instaciarPulso   = null;
		 instanciarNumero = null;
		 
		 
	
	}

}
