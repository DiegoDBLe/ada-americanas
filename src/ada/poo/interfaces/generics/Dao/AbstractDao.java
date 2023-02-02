package ada.poo.interfaces.generics.Dao;

import ada.poo.interfaces.generics.DAO;

public class AbstractDao<T, K> implements DAO<T, K> {

    @Override
    public T create(T objetoDao) {
        return null;
    }

    @Override
    public T findById(K id) {
        return null;
    }

    @Override
    public void update(T objetoDao) {

    }

    @Override
    public boolean delete(K id) {
        return false;
    }
}
