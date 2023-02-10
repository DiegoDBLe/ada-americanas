package ada.poo.interfaces.segregation;

public class Cachorro implements SabeNadar, SabeAndar {


    @Override
    public void nadar() {
        System.out.println("Cachorro nadando");
    }

    @Override
    public void andar() {
        System.out.println("Cachorro andando");
    }

}
