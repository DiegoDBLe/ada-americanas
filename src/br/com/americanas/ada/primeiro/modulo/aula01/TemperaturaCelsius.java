package br.com.americanas.ada.primeiro.modulo.aula01;

import java.util.Scanner;

public class TemperaturaCelsius {
	
	public static void temperatura() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius: ");
		
		float celsius = input.nextFloat();
		float fahrenheit = (9 * celsius + 160) /5;
		float kelvin = celsius + 273; 
		
		System.out.println(celsius + "° celsius");
		System.out.println(fahrenheit + " fahrenheit");
		System.out.println(kelvin + " kelvin");
		
		input.close();
	}

}
