package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeDescontoProgressivo implements CalculadoraDeDesconto{
    @Override
    public Double calcular(Produto produto) {
        Double preco = produto.getPeso();

        if (preco >= 1_000.00){
            //20%de desconto
            return preco * 0.2;
        }else if (preco >= 500.00){
            //10%de desconto
            return preco * 0.1;
        }

        //5% de deesconto
        return preco * 0.05;
    }
}
