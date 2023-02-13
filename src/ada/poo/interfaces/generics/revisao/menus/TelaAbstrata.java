package ada.poo.interfaces.generics.revisao.menus;

import java.util.Scanner;

public abstract class TelaAbstrata {

    protected final Scanner scanner;

    protected TelaAbstrata(Scanner scanner) {
        this.scanner = scanner;
    }
}
