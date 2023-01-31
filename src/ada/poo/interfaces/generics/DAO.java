package ada.poo.interfaces.generics;

import ada.poo.interfaces.Animal;

public interface DAO<T, K> {

    T create (T objetoDao);

    public T findById(K id);
    public  void update(T objetoDao);
    public boolean delete (K id);

}
