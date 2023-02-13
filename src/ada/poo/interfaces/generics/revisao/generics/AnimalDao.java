package ada.poo.interfaces.generics.revisao.generics;

public class AnimalDao extends AbstractDao <Animal, String>{
    public AnimalDao(Repository<Animal, String> repository) {
        super(repository);
    }
}
