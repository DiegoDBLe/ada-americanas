package ada.poo.interfaces.generics.revisao.generics;

public class PessoaDao extends AbstractDao<Pessoa, String> {
    public PessoaDao(Repository<Pessoa, String> repository) {
        super(repository);
    }
}
