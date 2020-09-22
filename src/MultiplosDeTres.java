import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList <Integer>(); //Arreglo para almacenar numeros de cliente
		ArrayList <Integer> filtro = new ArrayList <Integer>(); //Arreglo para almacenar numeros filtrados
		System.out.println("Ingrese la cantidad de numeros"); //Se solicita a cliente indicar cantidad de numeros a ingresar
		int contador = sc.nextInt(); //Variable contador que guarda dato ingresado por cliente y compartida a metodos
		numeros = datos(sc,contador,numeros); // Se recepcionan numeros ingresados y se asignan a un arreglo
		filtro = filtro(numeros,contador,filtro); //Casteo a metodo filtro
		if (filtro.isEmpty()) { // Se valida si el array filtro esta vacio o no
			main(args); // En caso que este vacio se devuelve a metodo main
		
		}else { // En caso contrario continua la ejecucion
		
			
			int promedio3 = suma(filtro,args); // Variable que almacena los datos del metodo suma
			System.out.println("La suma de los numeros filtrados es: " + suma(filtro,args));// Impresion sumatoria numeros multiplos de 3
			System.out.println("El promedio de los numeros filtrados es: " + promedio(filtro,promedio3)); //Impresion promedio numeros multiplos de 3
			System.out.println("¿Desea continuar ejecutando el programa?"); // Se considera si el cliente quiere seguir ejecutando el programa
			System.out.println("S/N"); //Se consulta si quiere seguir donde S = si , N = no
			String continuar = sc.next(); //Se guarda dato ingresado por cliente en variable tipo String
				if (continuar.compareToIgnoreCase("S") ==0){  //Se valida respuesta ingresada considerando que el cliente ingrese s o S
					main(args); //Si es verdadero se retorna al metodo main
				} else {
					System.out.println("El programa ha finalizado correctamente"); // En caso contrario se informa a cliente que el programa finalizo
					System.exit(0); // y se ejecuta el termino
				}
		}		
		
		
	}
	
	public static ArrayList<Integer> datos (Scanner sc2,int contador, ArrayList <Integer> numeros) { //Metodo que recepciona datos de cliente
		
		
		System.out.println("A continuacion, favor ingresar los " + contador + " numeros");
		for (int i = 0; i < contador; i++) { //Ciclo para almacenar datos
			int a = sc2.nextInt(); //Recepcion de datos ingresados por cliente
			numeros.add(a); //Se agregan datos recepcionados al arreglo
			
			
				
			}
		return numeros; //Se retornan datos obtenidos a metodo main
		}
		
	public static ArrayList <Integer> filtro(ArrayList <Integer> numeros, int contador, ArrayList <Integer> filtro) {
		//Metodo para filtrar informacion
		
		
		for (int i = 0; i < contador; i++ ) { //Ciclo para validar posicion por posicion si es multiplo de 3
			if (numeros.get(i)%3 == 0) { //Validacion para obtener numeros multiplo de 3
				filtro.add(numeros.get(i)); // Se agregan dichos numeros al arreglo 
			} 
				
		}
		
		return filtro; //Se retornan datos obtenidos a metodo main
		
	}
	
	public static  int suma (ArrayList <Integer> filtro, String[] args) { //Metodo para sumar los numeros
		
	
		int sum = 0; //Variable sumatoria
		for (int i = 0 ; i < filtro.size(); i++) { //Ciclo para obtener datos del arreglo
			if (filtro.get(i) != 0){ // Se obtienen datos posicion por posicion en base a variable contador i 
				sum += filtro.get(i); //Se agregan dichos valores a variable sumatoria
			} else if (filtro.get(i)==0) {
				main(args);
			}
				
			}
		return sum; // Se retornan datos a metodo main para su impresion
	}
	
	public static int promedio (ArrayList <Integer> filtro, int sum) { //Metodo para calcular promedio 
		
		int promedio2 = 0; //Variable promedio inicializada global para posterior evaluacion
		if (!filtro.isEmpty()) {
			promedio2 = sum / filtro.size(); //Variable que almacena el promedio  filtrado
			// entre la variable sumatoria (metodo suma) y el tamaño del array filtro

		}
		
		
		return promedio2; // Se retornan datos a metodo main para su impresion
	}
}
