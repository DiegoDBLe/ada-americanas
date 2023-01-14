package automoveis.oo.estatico;

public class TesteContextoEstatico {

    public static void main(String[] args) {

        Classe objeto = new Classe();
        objeto.setAtributo("teste1");
        objeto.setAtributoEstatico("testeEstatico");

        Classe objeto2 = new Classe();
        objeto2.setAtributo("teste2");
        objeto2.setAtributoEstatico("testeEstatico2");

        System.out.println(objeto.getAtributo());
        System.out.println(objeto.getAtributoEstatico());

        System.out.println("--------------------------------");

        System.out.println(objeto2.getAtributo());
        System.out.println(objeto2.getAtributoEstatico());


    }
}
