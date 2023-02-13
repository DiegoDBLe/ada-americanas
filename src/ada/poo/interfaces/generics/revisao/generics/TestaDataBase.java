package ada.poo.interfaces.generics.revisao.generics;

public class TestaDataBase {

    public static void main(String[] args) {

        PessoaDao pessoaDao = new PessoaDao(null);
        AnimalDao animalDao = new AnimalDao(null);

        pessoaDao.create(new Pessoa());
        animalDao.create(new Animal());
    }
}
