package ada.poo.interfaces.funcioal.exercicio.liskov;

public class TesteGeradorDeNumerosAleatorios {

    public static void main(String[] args) {

        GeradorDeNumerosAleatorios geradorDeNumerosAleatorios  = new GeradorDeNumerosAleatorios();
        Double numeroAleatorio = geradorDeNumerosAleatorios.generate();

        if(numeroAleatorio < 5.0) {
            System.out.println("Sem Sorte: " + numeroAleatorio);
        } else if (numeroAleatorio < 8.0) {
            System.out.println("Tá com Sorte: " + numeroAleatorio);
        } else if (numeroAleatorio  <=10) {
            System.out.println("Tá com Sorte: " + numeroAleatorio);
        }

        System.out.println("");
    }
}
