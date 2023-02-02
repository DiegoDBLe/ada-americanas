package ada.poo.interfaces.generics;

import ada.poo.interfaces.generics.objetos.*;

public class TestadorDeCaixa {

    public static void main(String[] args) {

        Caixa<Bola> caixaDeBola = new Caixa<Bola>();
        Caixa<Caneta> caixaDeCaneta = new Caixa<>();
        Caixa<Gato> caixaDeGato = new Caixa();
        Caixa<Animal> caixaDeAnimal = new Caixa();

        // colocando objetos na caixa
        caixaDeBola.colocarNaCaixa(new Bola());
        caixaDeCaneta.colocarNaCaixa(new Caneta());
        caixaDeGato.colocarNaCaixa(new Gato());
        caixaDeAnimal.colocarNaCaixa(new Cachorro());

        // recuperando os objetos; não é necessário realizar casting
        Bola bola = caixaDeBola.pegarObjetoDaCaixa();
        Caneta caneta = caixaDeCaneta.pegarObjetoDaCaixa();
        Gato gato = caixaDeGato.pegarObjetoDaCaixa();
        Animal animal = caixaDeAnimal.pegarObjetoDaCaixa();
    }
}
