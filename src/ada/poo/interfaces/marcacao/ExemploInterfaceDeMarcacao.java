package ada.poo.interfaces.marcacao;

import java.util.Arrays;
import java.util.List;

public class ExemploInterfaceDeMarcacao {

    public static void main(String[] args) {

        List animais = Arrays.asList(new Ornitorrinco(), new Papagaio(), new Tucano());

        for (Object animal: animais) {

            String className = animal.getClass().getSimpleName();

            if(isAve(animal)){
                System.out.println("O animal " + className + " é uma Ave e pode voar!");
            }else{
                System.out.println("O animal " + className + "não é uma Ave e não pode voar!");
            }
        }

    }

    public static boolean isAve(Object object){

        return object instanceof Ave;
    }
}
