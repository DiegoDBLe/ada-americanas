package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeFreteTransportadora implements CalculadoraDeFrete{
    @Override
    public Double calcular(Produto produto, Double km) {
        double precoKm = 0.6;
        if (km >= 100.00) {
            precoKm = 0.3;
        }
        return produto.getPeso() * km * precoKm;
    }
}
