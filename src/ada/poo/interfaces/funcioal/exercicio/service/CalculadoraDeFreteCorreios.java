package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeFreteCorreios implements CalculadoraDeFrete{

    @Override
    public Double calcular(Produto produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }
}
