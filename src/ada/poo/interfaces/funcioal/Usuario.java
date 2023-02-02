package ada.poo.interfaces.funcioal;

public class Usuario implements Autenticavel{
    @Override
    public boolean autenticar() {
        return Math.random() * 100 > 5;
    }
}
