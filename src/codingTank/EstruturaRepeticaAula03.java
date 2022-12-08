package br.com.americanas.ada.codingTank;

import java.util.Scanner;

public class EstruturaRepeticaAula03 {
	
	public static void main(String[] args) {

        // while, do while, for

        int contador = 0;
        while(contador <=10){
            System.out.println(contador);
            contador++;
        }

        do{
            contador++;
            System.out.println(contador);
        } while (contador <= 10);

        //Menu
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - soma");
            System.out.println("2 - divisao");
            System.out.println("3 - sair");
            opcao = scanner.nextInt();
        }while (opcao !=3);

        System.out.println("FOR");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        
        scanner.close();
    }

}
