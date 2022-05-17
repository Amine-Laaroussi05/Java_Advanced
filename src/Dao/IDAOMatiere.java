package Dao;

import FormationData.Matiere;

import java.util.List;

public interface IDAOMatiere extends IDao<Matiere, Long>{

    List<Matiere> findByID(Long id);
}
