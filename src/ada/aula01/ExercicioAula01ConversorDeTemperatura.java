package ada.aula01;

import java.util.Scanner;

// - Criar um programa em java que converta a temperatura de Fahrenheit para graus Celsius (clássico):
public class ExercicioAula01ConversorDeTemperatura {
	
	public static void temperatura() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		
		float celsius = entrada.nextFloat();
		float fahrenheit = (9 * celsius + 160) /5;
		float kelvin = celsius + 273; 
		
		System.out.println(celsius + "° celsius");
		System.out.println(fahrenheit + " fahrenheit");
		System.out.println(kelvin + " kelvin");
		
		entrada.close();
	}
}
