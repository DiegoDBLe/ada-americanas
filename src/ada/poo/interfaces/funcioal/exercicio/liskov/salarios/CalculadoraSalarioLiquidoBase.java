package ada.poo.interfaces.funcioal.exercicio.liskov.salarios;

public class CalculadoraSalarioLiquidoBase implements CalculadoraDeSalarioLiquido{

    @Override
    public Double calcular(Double salarioBruto, Double desconto, Double bonus) {

        Double salarioMinimo = 1302.0;

        if (salarioBruto < salarioMinimo) {
            throw new RuntimeException("salário não pode ser menor que o minimo");
        }

        if (desconto > salarioBruto) {
            throw new RuntimeException("desconto não pode ser maior do que o sálario bruto");
        }

        if(bonus > 1000){
            throw new RuntimeException("bonus não pode ser maior do que R$ 1000,00");
        }
        return (salarioBruto - desconto) + bonus;
    }
}
