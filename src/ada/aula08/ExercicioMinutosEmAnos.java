package ada.aula08;

import java.util.Scanner;

public class ExercicioMinutosEmAnos {

	public static void main(String[] args) {

		double minutosNoAno = 60 * 24 * 365;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de minutos: ");
		
		double minutos = entrada.nextDouble();
		
		long anos = (long) (minutos / minutosNoAno);
		int dias = (int) (minutos / 60 /24) % 365;
		
		System.out.println((int) minutos + " minutos são aproximadamente " + anos + " anos" + " e " + dias + " dias" );
		
		entrada.close();
	}
}
