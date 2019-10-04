package tablasMultiplicadores;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tablasMulti();
		
	}
	
	public static void tablasMulti() {
		
		Scanner input = new Scanner(System.in);
		
		int salida=0;
		int tabla ;
		System.out.println("Introduce el numero de la tabla ");
		salida=input.nextInt();
				
		
		for (int multi =0;multi<=10;multi++) {
				tabla = salida *multi;		
			System.out.println("Resultado" + multi+ " " + tabla );
			
				
			
		}
		
		
		
		
	}


}
