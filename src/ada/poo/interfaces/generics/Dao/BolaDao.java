package ada.poo.interfaces.generics.Dao;

import ada.poo.interfaces.generics.objetos.Bola;

public class BolaDao extends AbstractDao<Bola, Long> implements  DeleteAllDao{

    // Utiliza da composição para ganhar os comportamentos de quem implementar DeleteAllDao
    private final DeleteAllDao deleteAllDao;

    public BolaDao(DeleteAllDao deleteAllDao) {
        this.deleteAllDao = deleteAllDao;
    }


    @Override
    public void deleteAll() {
        // delega a execução do método deleteAll para o objeto adicionado via composição
        deleteAllDao.deleteAll();
    }
}
