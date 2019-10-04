package arreglosOpuestos;

import java.util.Scanner;

public class ArreglosOpuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 arreglosOpuestos();
		
	}

	public static void arreglosOpuestos() {
		
		Scanner entrada = new Scanner(System.in);
		int arrayOp[] = null;
		arrayOp = new int[10];
		int arrayOp2[] = null;
		arrayOp2 = new int[arrayOp.length];
	
	
	for (int row=0;row<arrayOp.length;row++) {
			System.out.println("introduce el valor del arreglo 1 ");
			arrayOp[row] = entrada.nextInt();
						
		}
	// for intercambia los valores 
	for (int row = 0; row < arrayOp.length; row ++) {
		arrayOp2[row] = arrayOp[row];
		
		
		
	}
	/// mostrar los valores del arreglo intercambiado 
	for (int row = 0; row < arrayOp2.length;row++) {
		System.out.println("Datos del arreglo 1 "+arrayOp2[row]);
		
		// decrementar el row para que empiece del valor mas grande o declarado en el row 
		
	}
	
	
	
	
	}
	
}
