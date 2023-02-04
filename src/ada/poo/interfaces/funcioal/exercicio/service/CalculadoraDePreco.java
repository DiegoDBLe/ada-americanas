package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDePreco {

    private final CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete();
    private final CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

    public Double calculadoraDePreco(Produto produto, Double km){
        Double frete = calculadoraDeFrete.calcularFrete(produto, km);
        Double desconto = calculadoraDeDesconto.calcularDesconto(produto);
        return produto.getPreco() + frete - desconto;
    }
}
