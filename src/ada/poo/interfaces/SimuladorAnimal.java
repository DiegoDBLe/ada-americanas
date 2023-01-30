package ada.poo.interfaces;

import java.util.*;

public class SimuladorAnimal {

    public static void main(String[] args) {

        Animal cao = new Cachorro();
        Animal cao2 = new Cachorro();
        cao.setEspecie("cachorro");
        cao.setPeso(5);

        cao2.setEspecie("cachorro2");
        cao2.setPeso(10);

        Animal peixe = new Peixe();
        Animal peixe2 = new Peixe();
        peixe.setEspecie("peixe");
        peixe.setPeso(2.5);

        peixe2.setEspecie("peixe2");
        peixe2.setPeso(3);

        Animal onitorrinco = new Ornitorrinco();
        onitorrinco.setEspecie("ornitorrinco");
        onitorrinco.setPeso(30);

        Animal papagaio = new Papagaio();
        papagaio.setEspecie("Papagaio");
        papagaio.setPeso(4.5);

        Animal gato = new Gato();
        gato.setEspecie("Gato");
        gato.setPeso(9);

        List<Animal> listaAnimais = Arrays.asList(cao, peixe, onitorrinco, papagaio, gato, cao2, peixe2);
        System.out.println("------ Lista Animais Ordem que foi inserida: -------- ");
        for (Animal animal : listaAnimais) {
           System.out.println("Especie: " + animal.getEspecie() + " - Peso: " + animal.getPeso() + "Kgs");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("------ Lista Animais Por ordem crescente de Peso: -------- ");
        Collections.sort(listaAnimais);
        for (Animal animal : listaAnimais) {
            System.out.println("Especie: " + animal.getEspecie() + " - Peso: " + animal.getPeso() + "Kgs");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("------ Lista Animais Por ordem Decrescente de Peso: -------- ");
        Collections.reverse(listaAnimais);
        for (Animal animal : listaAnimais) {
            System.out.println("Especie: " + animal.getEspecie() + " - Peso: " + animal.getPeso() + "Kgs");
        }

        System.out.println("Ordenando por comparator: ");
        Collections.sort(listaAnimais, new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getEspecie().compareTo(animal2.getEspecie());
            }
        });
        System.out.println(listaAnimais);
        System.out.println("- - - - - Fim Do comparator - - - - - ");

        for (Animal animal: listaAnimais) {
        if (animal instanceof AnimalQueNada animalQueNada) {
                colocarNaPiscina(animalQueNada);
            }
        }
    }

    public static void printAtributo(Animal animal) {
        System.out.println(animal);
    }

    public static void colocarNaPiscina(AnimalQueNada animalQueNada) {
        System.out.println("Colocando animal na piscina" + animalQueNada.getClass().getSimpleName());
    }
}
