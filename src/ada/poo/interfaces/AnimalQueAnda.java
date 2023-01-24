package ada.poo.interfaces;

public interface AnimalQueAnda{

    // não precisa colocar modificador de acesso, sempre é public e abstract
    int obterQuantidadeDePerna();

    default void andar(){
        System.out.println("Andando");
    };


}
