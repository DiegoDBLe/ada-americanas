package ada.poo.interfaces.funcioal.exercicio.service;

import ada.poo.interfaces.funcioal.exercicio.model.Produto;

public class CalculadoraDeFrete {

    public Double calcularFrete(Produto  produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }
}
