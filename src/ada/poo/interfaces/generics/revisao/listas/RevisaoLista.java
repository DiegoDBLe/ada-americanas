package ada.poo.interfaces.generics.revisao.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RevisaoLista {

    public static void main(String[] args) {

        // List -> Permite Repeticoes             -> ArrayList LinkedList
        // Set -> Não Permite Repeticoes        -> LinkedHashSet HashSet TreeSet

        List<Animal> listOfAnimais = new ArrayList<>();

        Set<Animal> setOfAnimais = new TreeSet<>();

        listOfAnimais.add(new Cachorro("Geleia"));
        listOfAnimais.add(new Cachorro("Max"));
        listOfAnimais.add(new Gato("Savana"));

        System.out.println("Lista de Animais tem tamanhho " + listOfAnimais.size());

        setOfAnimais.add(new Cachorro("Geleia"));
        setOfAnimais.add(new Gato("Pael"));
        setOfAnimais.add(new Gato("Pandora"));
        setOfAnimais.add(new Gato("Miau"));

        System.out.println("Set de animais tem tamanhho: " + setOfAnimais.size());

        for (Animal animal : setOfAnimais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }

        System.out.println();

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro("Max"));
        cachorros.add(new Cachorro("Geleia"));

        for (Animal animal: cachorros) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }

        String nomeParaSerPesquisado = "Geleia";
        Cachorro cachorroEncontrado = null;
        for (Cachorro cachorro: cachorros){
            if(cachorro.getNome().equals(nomeParaSerPesquisado)){
                cachorro.setNome("tobias");
                cachorroEncontrado = cachorro;
                break;
            }
        }

        cachorros.get(0).setNome("Jacaré");
        exibirNomeDosAnimais(cachorros);

        if (cachorroEncontrado != null){
            cachorroEncontrado.setNome("Bob");
        }

        System.out.println();

        exibirNomeDosAnimais(cachorros);


        manipulandoListaCorretamente(cachorros);
        exibirNomeDosAnimais(cachorros);

        System.out.println();
        System.out.println();

        manipuladoListaDeAnimais(listOfAnimais);


    }

    public static void manipuladoListaDeAnimais(List<Animal> animais){
        animais.add(new Gato("Gato 1"));
        animais.add(new Gato("Gato 2"));

        animais.add(new Cachorro("Cachorro 1"));
        animais.add(new Cachorro("Cachorro 2"));

        for (Animal animmal:animais) {
            System.out.println(animmal.getClass().getName() + " : " + animmal.getNome());
        }
    }

    public static void manipulandoListaDeCachorros(List<Cachorro> cachorros){
        System.out.println("Adicionando novo cachorrinho");
        cachorros.add(new Cachorro("Max"));
    }

    public static void manipulandoListaCorretamente(List<? extends Animal> animais) {
        //        animais.add(new Cachorro("Dog"));
        //       animais.add(new Gato("Cat"));
    }

    public static void manipulandoListaIndevidamente(List listaQualquer) {
        listaQualquer.add("Novo animal");
    }

    public static void exibirNomeDosAnimais(List<? extends Animal> animais) {

        for (Animal animal: animais) {
            System.out.println(animal.getClass().getSimpleName() + " :  " + animal.getNome());
        }
    }
}
