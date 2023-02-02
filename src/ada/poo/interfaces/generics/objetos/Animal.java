package ada.poo.interfaces.generics.objetos;

public interface Animal extends Comparable<Animal> {

    void informarPeso(Double peso);
    Double obterPeso();
    @Override
    public default int compareTo(Animal o) {
        return this.obterPeso().compareTo(o.obterPeso());
    }
}
