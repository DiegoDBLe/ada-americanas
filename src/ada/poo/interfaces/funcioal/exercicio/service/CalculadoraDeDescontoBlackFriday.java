package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeDescontoBlackFriday implements CalculadoraDeDesconto{
    @Override
    public Double calcular(Produto produto) {
        return produto.getPreco() * 0.8;
    }
}
