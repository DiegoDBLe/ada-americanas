package codingTank;

import java.util.Scanner;

public class ExercicioLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indique um número inteiro positivo:");
		int n = scanner.nextInt();

		for (int i = n; i >= 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	} 
}
