package ada.poo.interfaces.generics.revisao.menus;

import java.util.Scanner;

public class TelaDeCadastro extends TelaAbstrata{

    private final Usuario usuario;
    protected TelaDeCadastro(Scanner scanner, Usuario usuario) {
        super(scanner);
        this.usuario = usuario;
    }

    public Usuario cadastrar(){

        System.out.println("Idade: ");
        Integer idade = scanner.nextInt();
        usuario.setIdade(idade);
        return usuario;
    }
}
