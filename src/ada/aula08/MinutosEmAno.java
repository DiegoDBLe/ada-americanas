package ada.aula08;

import java.util.Scanner;

public class MinutosEmAno {

	public static void main(String[] args) {

		double hora = 60;
		double dia =  24;
		double ano = 365;
		
		double tempoTotal = hora * dia * ano;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de minutos: ");

		double minutos = entrada.nextDouble();
		
		double anos = minutos / tempoTotal;
		double dias = (minutos / hora / dia) %ano;
		
		System.out.printf(" %.2f minutos são aproximadamente  %.1f anos e %.1f dias", minutos, anos ,dias );
		
		entrada.close();
		
	}

}
