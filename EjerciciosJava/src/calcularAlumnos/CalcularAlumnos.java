package calcularAlumnos;

import java.util.Scanner; 

public class CalcularAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Objetivo de la funcion: Realiza el calculo de el porcentaje de hombre y de mujeres.
		Fecha de creacion: 16 de marzo 2108.
		Creo: Erick Tobias 
		Email: Erickdamian17@gmail.com*/
		
		capturaData();
		
	}
	
	public static void capturaData () {


        String DataEntrada = "";

        System.out.println ("Por favor Capture cualquier valor:");

        Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner

        DataEntrada = entradaEscaner.nextLine (); 

        System.out.println ("Entrada recibida por teclado es: \"" + DataEntrada +"\"");

	}	

	public static int calculAlumno (int pHombre,int pMujeres, int pAlumnos) {

		int Total;
		
		Total= pHombre*100/pAlumnos;
				
		return Total;		
		
		
		
	}
	
	public  int calculAlumno2 (int pHombre,int pMujeres, int pAlumnos) {

		int Total;
		
		Total= pHombre*100/pAlumnos;
		System.out.println("El total de alumnos es "+ Total);
		
		return Total;		
		
		
		
	}
		
}

