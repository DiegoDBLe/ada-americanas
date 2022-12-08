package br.com.americanas.ada.codingTank;

import java.util.Scanner;

public class ArrayAula04 {

	public static void main(String[] args) {


        int[] arrayidade = new int[2];

        // byte, short, int, long, float, double -> 0
        //boolean -> false
        //String -> null
        System.out.println(arrayidade[0]);

        for(int i = 0; i <= arrayidade.length; i++){
            System.out.println("Passando por -> " + i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas idades você deseja informar: ");
        int[] arrayIdades = new int[scanner.nextInt()];

        for (int i = 0; i <= arrayIdades.length; i++){
            System.out.println("Informe a " + (i + 1) + " idade: ");
            arrayIdades[i] = scanner.nextInt();
        }
        for(int idade: arrayIdades) {
            System.out.println(idade + " ");
        }
        
        scanner.close();
    }
}
