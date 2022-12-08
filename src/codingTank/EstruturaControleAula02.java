package br.com.americanas.ada.codingTank;

import java.util.Scanner;

public class EstruturaControleAula02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Lendo numero inteiro
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();

		// Lendo String:
		System.out.println("Informe seu nome: ");
		String nome = scanner.next();

		boolean isMaiorIdade = idade >= 18;

		if (isMaiorIdade) {
			System.out.println("Sr(a):" + nome.toUpperCase() + " é Maior de idade ");
		} else if (idade >= 12 && idade < 18) {
			System.out.println("Sr(a):" + nome.toUpperCase() + " é Adolecente ");
		} else {
			System.out.println("Sr(a):" + nome.toUpperCase() + "é Menor de idade");
		}

		// if ternario: [Condição booleana] ? [bloco true] : [bloco false]
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem);

		System.out.println("Informe o numero: ");

		int isDiasDaSemana = scanner.nextInt();

		switch (isDiasDaSemana) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quita-feira");
			break;
		case 5:
			System.out.println("Sexta-feixa");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número inválido.");
			break;
		}
		
		scanner.close();
	}
}
