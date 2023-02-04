package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class TesteCalculadoresDePreco {

    public static void main(String[] args) {

        CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete();

        Produto produto = new Produto(1_000.0, 1.0);

       Double precoFrete = calculadoraDeFrete.calcularFrete(produto, 30.5);
        System.out.println("Preço do Frete: " + precoFrete);

    }
}
