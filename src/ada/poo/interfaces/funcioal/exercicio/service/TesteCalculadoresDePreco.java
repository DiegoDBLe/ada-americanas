package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class TesteCalculadoresDePreco {

    public static void main(String[] args) {

        CalculadoraDeFreteCorreios calculadoraDeFreteCorreios = new CalculadoraDeFreteCorreios();

        CalculadoraDePreco calculadoraDePreco1 = new CalculadoraDePreco(calculadoraDeFreteCorreios, new CalculadoraDeDescontoBlackFriday());
        CalculadoraDePreco calculadoraDePreco11 = new CalculadoraDePreco(calculadoraDeFreteCorreios, new CalculadoraDeDescontoProgressivo());

//        CalculadoraDePreco calculadoraDePreco2 = new CalculadoraDePreco(new CalculadoraDeFreteTransportadora(), new CalculadoraDeDescontoBlackFriday());




        Produto produto = new Produto(100.0, 10.00);
        Double km = 10.00;

        System.out.println("Preco com a calculadora 1");
        System.out.println(calculadoraDePreco1.calcular(produto, km));

        System.out.println("Preco com a calculadora 2");
        System.out.println(calculadoraDePreco11.calcular(produto, km));

    }
}
