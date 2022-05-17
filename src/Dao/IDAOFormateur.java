package Dao;

import FormationData.Adresse;
import FormationData.Formateur;

import java.util.List;

public interface IDAOFormateur extends  IDao<Formateur, Long>{

    List<Formateur> findByID(Long id);
}
