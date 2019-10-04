package excel;
import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import numerosPostivos.NumerosPositivos;
import tresNumerosLeer.TresNumerosLeer;
import sexoPulsaciones.SexoPulsaciones;
//import //numerosPositivos.NumerosPositivos;

//import jxl.*;


public class readExcel extends NumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leerParametros ();
		 leerMetodosExcel ();
		
		
try{
			
			
			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\nombres.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer

			String nombre;
			
			for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
				for (int columna = 0; columna < sheet.getColumns(); columna++) { //recorremos las columnas
					nombre = sheet.getCell(columna, fila).getContents(); //celda leída
					System.out.print(nombre + " "); // imprimir nombre
				}
				System.out.println("\n"); //   /n es un enter 
			}
		}catch(Exception e){
			System.out.println("Ocurrio un error");
		}
	}
	
	/*public static void  leerParametros () {
		
		String nombre = "";
		String Leer = "";
		
		try{
			
			
			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\nombres.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet(1); //Seleccionamos la hoja que vamos a leer

			
			
			//System.out.println(sheet.getColumns());
			
			for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
				for (int columna = 0; columna < sheet.getColumns()-1; columna++) { //recorremos las columnas
					
					  Leer = sheet.getCell(5, fila).getContents();
					  
					  
					if (Leer.equals("SI")) {
						nombre = sheet.getCell(columna, fila).getContents(); //celda leída
						System.out.print(nombre + " "); // imprimir nombre						
						
					} 
					
					
				}
				if (Leer.equals("SI")) {
					System.out.println("\n"); //   /n es un enter 					
					
				} 
			
			}
		}catch(Exception e){
			System.out.println("Ocurrio un error");
		}
	}*/

	public static void  leerMetodosExcel () {
		
		String nombreMetodo = "";
		String Leer = "";
		String valor1,valor2,valor3 ="";
		
		
		TresNumerosLeer numerosLeer = new TresNumerosLeer();
		SexoPulsaciones pulsacionesLeer = new SexoPulsaciones();
		
		
		try{
			
			
			Workbook workbook  = Workbook.getWorkbook(new File("C:\\Automation\\nombres.xls")); //Pasamos el excel que vamos a leer
			Sheet sheet = workbook.getSheet(2); //Seleccionamos la hoja que vamos a leer

			
			
			//System.out.println(sheet.getColumns());
			
			for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
				//for (int columna = 0; columna < sheet.getColumns(); columna++) { //recorremos las columnas
					
					  Leer = sheet.getCell(5, fila).getContents();
					  
					  
					if (Leer.equals("SI")) {
						nombreMetodo  = sheet.getCell(4, fila).getContents(); //celda leída
						System.out.print(nombreMetodo + " "); // imprimir nombre	
						valor1  = sheet.getCell(1, fila).getContents(); //celda leída
						valor2  = sheet.getCell(2, fila).getContents(); //celda leída
						valor3  = sheet.getCell(3, fila).getContents(); //celda leída
						
						System.out.println(nombreMetodo);
						System.out.println(valor1);
						System.out.println(valor2);
						System.out.println(valor3);
						
						switch(nombreMetodo){
							
							case "calcularNumeros":
								numerosLeer.calcularNumeros(Integer.parseInt(valor1),Integer.parseInt(valor2),Integer.parseInt(valor3));
								break;
								
							case "calculoPulsacion":
								pulsacionesLeer.calculoPulsacion(valor1,Integer.parseInt(valor2));
								break;
							
							case "numerosPositivos":
								numerosPositivos();
								break;
								
							default:
								System.out.println(" no existe la opcion ");
								break;
							
							
						//}/
						
						
					} 
					
					
				}
				if (Leer.equals("SI")) {
					System.out.println("\n"); //   /n es un enter 					
					
				} 
							
				
			}
			
		}catch(Exception e){
			System.out.println("Ocurrio un error");
		}
	}
	
		
}
	
	

		
		
		
