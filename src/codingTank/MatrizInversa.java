package codingTank;

import java.util.Scanner;

public class MatrizInversa {

	/*
	 * [][][] [][][] [][][] Com base no input do usuario crie uma matriz quadrada e
	 * preencha a sua diagonal invertida com o valor 1 [][][1] [][1][] [1][][] /
	 */

	public static void main(String[] args) {

		Scanner sacanner = new Scanner(System.in);

		System.out.println("Informe o tamanho da matriz\nPrimeiro Linha/ Depois Coluna: ");
		int matriz[][] = new int[sacanner.nextInt()][sacanner.nextInt()];

		int contador = 1;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][matriz.length - contador] = 1;
				System.out.print("[" + matriz[linha][coluna] + "]");
			}
			contador++;
			System.out.println();
		}
		sacanner.close();
	}

}
