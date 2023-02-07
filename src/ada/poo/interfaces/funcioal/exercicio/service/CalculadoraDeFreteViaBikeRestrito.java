package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

//Classe A implements B
public class CalculadoraDeFreteViaBikeRestrito implements CalculadoraDeFrete{
    @Override
    public Double calcular(Produto produto, Double km){
        Double valorKm = 0.4;

        if (km > 5.000) {
            valorKm = 1.0;
        }

        if (km > 10.00){
            throw new RuntimeException("Não cobrimos essa Distancia");
        }

        return produto.getPeso() * km * valorKm;
    }
}
