package ada.poo.interfaces.marcacao;

import java.util.ArrayList;
import java.util.List;

public class ExemploInterfaceDeMarcacao {

    public static void main(String[] args) {

        List<Ave> aves = new ArrayList<>();

        aves.add(new Pardal());
        aves.add(new Tucano());

    }

    public static void voar(Object object){

        if(object instanceof Ave ave){
            System.out.println(" A ave " + ave.getClass().getSimpleName() + "ave sabe voar");
        }else{
            System.out.println("" + object.getClass().getSimpleName() + "não sabe voar");
        }
    }
}
