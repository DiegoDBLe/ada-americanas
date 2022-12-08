package ada.aula02;

import java.util.Scanner;

public class ExercicioAula02MenorNumero {
	
	public static void menorNumero() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o 1° número: ");
		double numero1 = input.nextDouble();
		
		System.out.println("Informe o 2° número: ");
		double numero2 = input.nextDouble();
		
		System.out.println("Informe o 3° número: ");
		double numero3 = input.nextDouble();
		
		System.out.println("O menor número é: " + menorNumeroDIgitado(numero1, numero2, numero3));
		
		input.close();
	}

	private static double menorNumeroDIgitado(double numero1, double numero2, double numero3) {
		return Math.min(Math.min(numero2, numero3), numero1);
	}
}
