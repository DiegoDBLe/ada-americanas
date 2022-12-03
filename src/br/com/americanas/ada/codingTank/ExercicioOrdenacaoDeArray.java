package br.com.americanas.ada.codingTank;

import java.util.Random;
import java.util.Scanner;

public class ExercicioOrdenacaoDeArray {

	/*
	 * Enunciado: Dado um array de n posições, todas preenchidas com números
	 * inteiros, crie um algoritmo capaz de ordenar o array e colocar os números em
	 * ordem crescente. Regras: O array deve ser criado com o tamanho informado pelo
	 * usuário. O preenchimento deve ser feito com números gerados aleatoriamente. A
	 * ordenação deve ocorrer de forma crescente, conforme mostrado no exemplo. Deve
	 * ser impresso o array antes da ordenação e após, assim possibilitando a
	 * comparação visual.
	 */
	public static void main(String[] args) {

		int auxiliar;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Infomre quantas posições terá o Array: ");
		int array[] = new int[scanner.nextInt()];

		System.out.println("Antes da Ordenação: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
			System.out.print(array[i] + ",");
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}
		System.out.println();
		System.out.println("Depois da Ordenação: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		
		scanner.close();
	}

}
