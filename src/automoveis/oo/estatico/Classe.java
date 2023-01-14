package automoveis.oo.estatico;

public class Classe {

    private String atributo;
    private static String atributoEstatico;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributoEstatico() {
        return atributoEstatico;
    }

    public void setAtributoEstatico(String atributoEstatico) {
        Classe.atributoEstatico = atributoEstatico;
    }
}
