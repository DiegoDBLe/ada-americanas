package ada.poo.interfaces.generics;


import ada.poo.interfaces.Animal;
import ada.poo.interfaces.generics.Dao.AnimalDao;
import ada.poo.interfaces.generics.Dao.BolaDao;
import ada.poo.interfaces.generics.Dao.CanetaDao;
import ada.poo.interfaces.generics.Dao.DeleteAll;
import ada.poo.interfaces.generics.objetos.Bola;
import ada.poo.interfaces.generics.objetos.Cachorro;
import ada.poo.interfaces.generics.objetos.Caneta;

import java.util.UUID;

public class TestadorDao {

    public static void main(String[] args) {

        AnimalDao animalDao = new AnimalDao();
        BolaDao bolaDao = new BolaDao(new DeleteAll());
        CanetaDao canetaDao = new CanetaDao();

//        animalDao.create(new Cachorro());
        bolaDao.create(new Bola());
        canetaDao.create(new Caneta());


        // não precisa realizar o casting
        Animal animal = animalDao.findById(UUID.randomUUID().toString());
        Bola bola = bolaDao.findById(1000L);
        Caneta caneta = canetaDao.findById(1);


    }
}
