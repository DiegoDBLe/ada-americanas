package ada.poo.interfaces.generics.revisao.menus;

import java.util.Scanner;

public class TelaDeLogin extends TelaAbstrata{
    protected TelaDeLogin(Scanner scanner) {
        super(scanner);
    }

    public Usuario autenticar() {

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        if("admin".equals(senha)){
            return new Usuario(nome);
        }
        return null;
    }
}
