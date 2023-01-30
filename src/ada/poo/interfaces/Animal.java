package ada.poo.interfaces;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Animal implements Comparable<Animal>{

    private int numeroDeOlhos;
    private double peso;
    private double tamanho;
    private String habitat;
    private String tipoAlimentacao;
    private String especie;

    @Override
    public int compareTo(Animal animal) {

        if (this.peso > animal.peso) {
            return 1;
        } else if (this.peso == animal.peso) {
            return 0;
        } else {
            return -1;
        }
    }

}
