package ada.aula03;

import java.util.Scanner;

public class ExercicioAula03MediaAritimetica {

	//public static void main(String[] args) {

	public static void media() {

		int soma = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Quantos números desejda informar? ");

		int[] mediaAritimetica = new int[input.nextInt()];

		for (int i = 0; i < mediaAritimetica.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			mediaAritimetica[i] = input.nextInt();
			soma = soma + mediaAritimetica[i];

		}

		System.out.println("Média aritmética é : " + soma / mediaAritimetica.length);
		
		input.close();
	}
}
