package ada.poo.interfaces.funcioal.exercicio.liskov.salarios;

import ada.poo.interfaces.funcioal.exercicio.liskov.CalculadoraSimples;

public class CalculadoraSalarioBonus extends CalculadoraSalarioLiquidoBase {

    @Override
    public Double calcular(Double salarioBruto, Double desconto, Double bonus) {
         double salario = super.calcular(salarioBruto, desconto, bonus);
         return salario + salarioBruto * 0.5;
    }
}
