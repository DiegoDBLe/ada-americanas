package ada.poo.interfaces;

import lombok.Setter;

@Setter
public class Ornitorrinco extends Animal implements AnimalQueAnda, AnimalQueVoa, AnimalQueNada{

    private boolean temAsas;

    public boolean isTemAsas() {
        return temAsas;
    }

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }

    @Override
    public void voar() {
        System.out.println("Voando baixo");
    }

    @Override
    public int obterQuantidadeDePerna() {
        return 4;
    }
}
