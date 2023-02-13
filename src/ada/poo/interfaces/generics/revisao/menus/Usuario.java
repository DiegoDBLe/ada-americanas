package ada.poo.interfaces.generics.revisao.menus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private final String nome;
    private Integer idade;

    public Usuario(String nome) {
        this.nome = nome;
    }
}
