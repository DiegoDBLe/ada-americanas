package ada.poo.interfaces.generics.objetos;

public class Gato implements Animal{
    private Double peso;

    public Gato() {}

    public Gato(Double peso) {
        this.peso = peso;
    }

    public void informarPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public Double obterPeso() {
        return this.peso;
    }
}
