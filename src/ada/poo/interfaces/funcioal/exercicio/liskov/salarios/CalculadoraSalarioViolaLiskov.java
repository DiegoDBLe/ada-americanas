package ada.poo.interfaces.funcioal.exercicio.liskov.salarios;

public class CalculadoraSalarioViolaLiskov extends  CalculadoraSalarioLiquidoBase {

    @Override
    public Double calcular(Double salarioBruto, Double desconto, Double bonus) {
        try {
            super.calcular(salarioBruto, desconto, bonus);
            throw new IllegalArgumentException("Viola Liskov");
        }catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
