package Dao;

import FormationData.Adresse;

import java.util.List;

public interface IDAOAdresse extends IDao<Adresse, Long>{

    List<Adresse> findByID(Long id);
}
