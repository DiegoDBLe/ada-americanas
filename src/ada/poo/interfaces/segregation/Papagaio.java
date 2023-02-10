package ada.poo.interfaces.segregation;

public class Papagaio implements SabeAndar, SabeVoar {

    @Override
    public void andar() {
        System.out.println("Papagaio nadando");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio voando");
    }
}
