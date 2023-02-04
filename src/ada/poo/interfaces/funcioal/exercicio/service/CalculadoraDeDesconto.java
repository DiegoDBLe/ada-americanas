package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

import java.util.Scanner;

public class CalculadoraDeDesconto {

    public Double calcularDesconto(Produto produto){
        Double preco = produto.getPreco();

        if(preco > 1000){
            return preco * 0.2;
        } else if (preco > 500.0) {
            return preco * 0.1;
        }
        return preco * 0.05;
    }
}
