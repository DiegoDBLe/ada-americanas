package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeDescontoNatal implements CalculadoraDeDesconto{
    @Override
    public Double calcular(Produto produto) {
        Double preco = produto.getPeso();
        return preco * 0.25;
    }
}
