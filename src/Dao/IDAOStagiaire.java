package Dao;

import FormationData.Stagiaire;

import java.util.List;

public interface IDAOStagiaire extends IDao<Stagiaire, Long>{

    List<Stagiaire> findByID(Long id);
}
