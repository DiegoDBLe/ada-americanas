package ada.poo.interfaces.generics;

import ada.poo.interfaces.generics.objetos.Animal;

public class CaixaDeTransporte<T extends Animal> {

    private T objeto;

    public void colocarNaCaixa(T objeto) {
        System.out.println("Colocando " + objeto.getClass().getSimpleName() + " na Caixa");
        this.objeto = objeto;
    }

    public T pegarObjetoDaCaixa() {
        return this.objeto;
    }
}
