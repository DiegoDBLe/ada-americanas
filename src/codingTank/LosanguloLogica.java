package br.com.americanas.ada.codingTank;

import java.util.Scanner;

public class LosanguloLogica {
	
	 /* Enunciar
    Nesse exercício deve ser desenhado um losangulo no console. Para isso teremos as seguintes regras:
    O usuário deve informar o tamanho do losangulo, esse tamanho trata da quantidade de colunas a serem utilizadas.
    O tamanho mínimo para o desenho é de 5 colunas. Não existe limitação para o tamanho máximo.
* */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int d = scanner.nextInt();
    int cont1 = 1;

    // Faz um tratamento para aceitar somente números ímpares entre 1 a 19
    while ((d % 2 == 0) || (d < 5)) {
        System.out.print("[ERRO] Digite um número ímpar acima de 5: ");
        d = scanner.nextInt();
    }

    for (
            int i = 1; i <= (d / 2) + 1; i++) //contador de linhas
    {
        for (int j = (d / 2) + 1; j > i; j--) //contador de asteriscos
            System.out.print("*");
        for (int k = 1; k <= cont1; k++) //contador de espaços
            System.out.print(" ");
        for (int j = (d / 2) + 1; j > i; j--) { //contador de asteriscos
            System.out.print("*");
        }
        for (int j = 1; j <= i; j++) {//contador de espaços
            System.out.print(" ");
        }
        cont1 += 2;
        System.out.println();
    }
    cont1 -= 2;

    for (int i = 1; i <= (d / 2); i++) //contador de linhas
    {
        for (int j = 1; j <= i; j++) //contador de asteriscos
            System.out.print("*");
        cont1 -= 2;
        for (int k = 1; k <= cont1; k++) //contador de espaços
            System.out.print(" ");
        for (int j = 1; j <= i; j++)
            System.out.print("*"); //contador de asteriscos
        System.out.println();
    }
    
    scanner.close();
}

}
