package ada.poo.interfaces.funcioal.exercicio.liskov;

//O filho faz a mesma coisa que o pai e algo mais, nunca menos que a classe pai
public class CalculadoraSimplesRestrita extends CalculadoraSimples {

    public Double multiplicar(Double n1, Double n2) {

        if (n1 < 5 || n2 < 5) {
            throw new RuntimeException("Não calculmamos números negativos");
        }

        if (n1 > 100 || n2 > 100) {
            throw new RuntimeException("Só calculo até 100");
        }

        return n1 * n2;
    }
}
