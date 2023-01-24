package ada.poo.interfaces;

import lombok.Setter;

@Setter
public class Papagaio extends Animal implements AnimalQueVoa, AnimalQueAnda {

    private boolean temAsas;

    public boolean isTemAsa(){
        return temAsas;

    }
    @Override
    public int obterQuantidadeDePerna() {
        return 0;
    }

    @Override
    public void andar() {
       System.out.println("Andando devagar");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
