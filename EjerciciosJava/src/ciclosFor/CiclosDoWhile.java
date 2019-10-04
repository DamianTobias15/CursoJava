package ciclosFor;

public class CiclosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		imprimirNumero();
	}

	public static void imprimirNumero() {
		int i;
		i=1;
		System.out.println("Imprimir los numeros del 0 al 100");
		
		do {
			System.out.println(i);
			i++;
		}while (i<=0);
	}
}
