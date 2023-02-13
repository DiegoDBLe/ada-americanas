package ada.poo.interfaces.generics.revisao.listas;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public abstract class Animal implements Comparable<Animal> {

    private String nome;
    private int idade;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return idade == animal.idade && Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public int compareTo(Animal o) {
        int comparacao1 = this.getNome().compareTo(o.getNome());
        int comparacao2 = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        return comparacao1 + comparacao2;
    }

}
