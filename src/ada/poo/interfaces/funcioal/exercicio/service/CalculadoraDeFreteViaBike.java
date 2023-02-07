package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeFreteViaBike implements CalculadoraDeFrete{
    @Override
    public Double calcular(Produto produto, Double km) {
        Double valorKm = 0.4;

        if (km > 5.000) {
            valorKm = 1.0;
        }

        return produto.getPeso() * km * valorKm;
    }
}
