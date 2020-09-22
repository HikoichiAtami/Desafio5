import java.util.ArrayList;
import java.util.Scanner;

public class Visitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		visitas(sc);
		crearSteps(sc);
		
	}
	public static void visitas(Scanner sc2) {
		
		System.out.println("Ingrese la cantidad de valores para el promedio"); // Se solicita a cliente indicar cuantos datos ingresara
		double sum = 0; // Variable sumatoria que se considera como double para mostrar decimales
		ArrayList <Double> visitas = new ArrayList <Double>(); //Arreglo que almacena datos ingresados por cliente
		int contador = sc2.nextInt(); // Variable contador para ingreso de datos a Array
		
		for (int i = 0 ; i < contador; i++) { //Ciclo para almacenar datos a Array
			double a = sc2.nextInt(); //Variable que recepciona datos de cliente
			visitas.add(a); // Se agregan los datos al Array
			sum +=a; // Tambien se agregan a la sumatoria
		}
		System.out.print("El promedio de los numeros ingresados es; " + sum / visitas.size());
	}

	public static void crearSteps(Scanner sc3) {
		
		ArrayList <Integer> pasos = new ArrayList <Integer>(); //Arreglo que almacena los datos correctos
		ArrayList <Integer> pasosfiltrados = new ArrayList <Integer>(); // Arreglo que almacena los datos filtrados
		System.out.println();//Salto de linea
		System.out.println("Ingrese la cantidad de pasos"); // Se solicita a cliente indicar cuantos datos ingresara
		int suma = 0; // Variable sumatoria para calcular promedio
		int contador = sc3.nextInt(); //Variable que determina la cantidad de datos que se ingresaran
		
		
		for (int i = 0; i < contador; i++) { //Ciclo para agregar datos al Array para luego filtrarlos
			int b = sc3.nextInt(); // Variable que recibe datos por parte del cliente
			pasos.add(b); // Aca se agregan datos ingresados por cliente a Array
			if(pasos.get(i) < 200 || pasos.get(i)> 100000 ) { //Validacion para filtrar datos segun requerimiento
				pasosfiltrados.add(pasos.get(i)); //Si cumple con la condicion se filtra y se anade a un Array auxiliar
			} else { 
				suma += b; // En caso contrario se agrega a la variable sumatoria
				}
			
		}
		System.out.println("El promedio de los pasos es " + suma / pasos.size()); // Impresio de promedio para los datos correctos
		
	}

	 
}
