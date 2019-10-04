package estructurasDeControl;

import conversionDollar.ConversionDollar;

public class EstructurasDeControl extends  ConversionDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CondicionleDoble(000,000);
		//CondicionAnidada(10,90);
		condicionalSwich(10,9);
		
	}

	public static void condicionalSimple () {
		

		try{
			
			if (calcularDollar(14.0,500) >30) {
				System.out.println("El valor es mayor a 30 "+ calcularDollar(14.0,500));
				
				
			}
			
			
		}
		catch (Exception e ){
			
			System.out.println("Se produjo un error al calcular el cambio a Dolar ");
			
		}
	}
	
	public static void CondicionleDoble(double pParametro1 , double pParametro2) {
		
		
		
		if (calcularDollar(pParametro1,pParametro2)>30) {
			System.out.println("El valor es mayor a 30" + calcularDollar(pParametro1,pParametro2));
			
		}else  {
			System.out.println("El valor es menor a 30 $" + " "+ calcularDollar(pParametro1,pParametro2));
			
			
		}
		
		
	}
	
	public static void CondicionAnidada(double pParametro1, double pParametro2 )  {
		
	 if (calcularDollar(pParametro1,pParametro2)== 30) {
		 System.out.println("El valor es igual a 30 $ " + calcularDollar(pParametro1,pParametro2));
		 
		 
	 }else if (calcularDollar(pParametro1,pParametro2)== 40) {
		 System.out.println("El valor es igual a 40 $ " + calcularDollar(pParametro1,pParametro2)); 
		 
	 } else if  (calcularDollar(pParametro1,pParametro2)== 50)  {
		 System.out.println("El valor es igual a 50 $ " + calcularDollar(pParametro1,pParametro2)); 
	 
	 }else {
		 System.out.println("El valor es diferente " + calcularDollar(pParametro1,pParametro2));  
	 }
	
	
	}                   
	
	public static void condicionalSwich(double pParametro1, double pParametro2) {
		
		String dolar;
		dolar = Double.toString(calcularDollar(pParametro1,pParametro2));
		
		switch (dolar) {
		case "30" :
			System.out.println("El valor es igual a 30 $ " + calcularDollar(pParametro1,pParametro2));
		    break;
		case "40":
			System.out.println("El valor es igual a 40 $ " + calcularDollar(pParametro1,pParametro2));
		    break;   
		    
		case "50" :
			System.out.println("El valor es igual a 50 $ " + calcularDollar(pParametro1,pParametro2));
		    break;
		default :
			 System.out.println("El valor es diferente " + calcularDollar(pParametro1,pParametro2));  

			
		
		    
		}
		
	}
	
}
