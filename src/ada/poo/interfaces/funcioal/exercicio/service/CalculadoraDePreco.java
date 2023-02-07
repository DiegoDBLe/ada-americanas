package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDePreco {

    private final CalculadoraDeFrete calculadoraDeFrete;
    private CalculadoraDeDesconto calculadoraDeDesconto;

    public CalculadoraDePreco(CalculadoraDeFrete calculadoraDeFrete, CalculadoraDeDesconto calculadoraDeDesconto) {
        this.calculadoraDeFrete = calculadoraDeFrete;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }

    public Double calcular(Produto produto, Double km) {
        Double frete = calculadoraDeFrete.calcular(produto, km);
        Double desconto = calculadoraDeDesconto.calcular(produto);
        return produto.getPreco() + frete - desconto;
    }
}
