package ada.poo.interfaces;

public class Gato extends Animal implements AnimalQueAnda, AnimalQueNada{

    public void nadar(){
        System.out.println("Nadando");
    }

    @Override
    public int obterQuantidadeDePerna() {
        return 4;
    }
}
