package alumnoPorAlumno;

import java.util.Scanner;

public class AlumnoPorAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculaAlumnosPor();
	}

	
	public static void calculaAlumnosPor() {
		
		String DataEntrada = "";
		Scanner entradaEscaner = new Scanner (System.in); //Se crea un objeto de la clase Scanner
		//variable para contar alumnos 
		int alumno = 0;
		int mujeres = 0;
		int hombres = 0;
		
		while (alumno<10) {
		//Salida se ingresa el sexo del alumno 
		 System.out.println ("Escribe tu sexo" );		 
		 alumno++;
		 DataEntrada = entradaEscaner.nextLine (); 
		 //agregar la condicion que guarda el sexo del alumno 
		 
		 if (DataEntrada =="hombre") {
			 mujeres = mujeres+1;
			 System.out.println("Mujeres" + mujeres);
		 
		 }else {
			 hombres = hombres+1;
			 System.out.println("Hombres "+ hombres );
			 
		 }
		 
		 System.out.println("El total de alumnos son"+ (hombres+mujeres));
		}
		
		
		
		
		
	}
}
