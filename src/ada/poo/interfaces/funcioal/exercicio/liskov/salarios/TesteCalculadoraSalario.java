package ada.poo.interfaces.funcioal.exercicio.liskov.salarios;


public class TesteCalculadoraSalario {

    public static void main(String[] args) {

        CalculadoraSalarioLiquidoBase liquidoBase = new CalculadoraSalarioLiquidoBase();
        final Double calcularBase = liquidoBase.calcular(1400.0, 500.0, 900.0);
        System.out.println("liquidoBase: R$ " + calcularBase);

        System.out.println("");

        CalculadoraSalarioBonus salarioBonus = new CalculadoraSalarioBonus();
        final Double calcular = salarioBonus.calcular(1400.0, 500.0, 900.0);
        System.out.println("salarioBonus: R$ " + calcular);

        System.out.println("");

        CalculadoraSalarioViolaLiskov violaLiskov = new CalculadoraSalarioViolaLiskov();
        final Double calculaViolaLiskov = violaLiskov.calcular(1400.0, 500.0, 900.0);
        System.out.println("violaLiskov: R$ " + calculaViolaLiskov);

    }
}
