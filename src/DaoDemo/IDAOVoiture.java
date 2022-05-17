package DaoDemo;

import io.Voiture;

import java.util.List;

public interface IDAOVoiture extends IDao<Voiture, String>{

    List<Voiture> findByCouleur(String couleur);
}
