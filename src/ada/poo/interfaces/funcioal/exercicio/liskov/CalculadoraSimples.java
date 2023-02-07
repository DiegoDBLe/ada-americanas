package ada.poo.interfaces.funcioal.exercicio.liskov;

public class CalculadoraSimples {

    public Double multiplicar(Double n1, Double n2) {

        if (n1 < 0 || n2 < 0) {
            throw new RuntimeException("Não calculmamos números negativos");
        }

        if (n1 > 10 || n2 > 10) {
            throw new RuntimeException("Só calculo até 10");
        }

        return n1 * n2;
    }
}
