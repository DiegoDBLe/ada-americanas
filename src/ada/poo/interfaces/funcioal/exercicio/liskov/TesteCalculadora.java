package ada.poo.interfaces.funcioal.exercicio.liskov;

public class TesteCalculadora {

    public static void main(String[] args) {

    CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
    CalculadoraSimples calculadoraSimplesRestrita = new CalculadoraSimplesRestrita();

    System.out.println("Multiplicar: " + calculadoraSimples.multiplicar(3.0, 10.0));
    System.out.println("");

    System.out.println("Multiplicar Restrito: " + calculadoraSimplesRestrita.multiplicar(2.0, 5.0));

    }
}
