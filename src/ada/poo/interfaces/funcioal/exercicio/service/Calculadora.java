package ada.poo.interfaces.funcioal.exercicio.service;

import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira o valor do produto: ");
            double valorProduto = entrada.nextDouble();

            System.out.print("Insira o valor do frete: ");
            double valorFrete = entrada.nextDouble();

            System.out.print("Insira o valor do desconto: ");
            double valorDeDesconto = entrada.nextDouble();

            double precoFinal = valorProduto + valorFrete - valorDeDesconto;

            System.out.println("Preço final: " + precoFinal);
        }
}
