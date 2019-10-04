package arregloMulti;

public class ArrayM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arreglosMulti();

	}

	public  void arreglosMulti() {
		
		 String matrizArray[][] = null; 
		
		 //row col
		 
		matrizArray = new String[2][2]; 
		
		//matrizArray //asignamos valores
		
		int cont = 20;
		
		for (int row = 0; row < matrizArray.length; row++){ 
			
			for (int col = 0; col < matrizArray.length; col++){ 
			
		//Agregamos valores al array
				
				matrizArray[row][col] = "valor acumulador "+ cont;
				cont = 10; 
			}
		}
		
		//imprimimos 
		for (int row = 0; row < matrizArray.length; row++){ 
			System.out.println("vuelta ciclo externo" + row);
			
			for (int col = 0; col < matrizArray.length; col++){ 
				//Agregamos valores al array 
				System.out.println("vuelta ciclo interno" + col); 
				System.out.println("renglon indice " + row);
				System.out.println("Columna indice " + col); 
				System.out.println(matrizArray[row][col]) ; 
			} 
		} 
			System.out.println("Imprimir con indices directos 0 y 0: "+ matrizArray[0][0]);
	}

		
}
	

