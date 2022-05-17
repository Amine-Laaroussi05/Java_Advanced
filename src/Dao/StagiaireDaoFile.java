package Dao;

import FormationData.Stagiaire;

import java.util.ArrayList;
import java.util.List;

public class StagiaireDaoFile implements IDAOStagiaire{


    @Override
    public List<Stagiaire> findByID(Long id) {
        List<Stagiaire> stagiaires = read();
        List<Stagiaire> resultats = new ArrayList<>();
        for (Stagiaire stagiaire: stagiaires){
            if (stagiaire.getId() == id) {
                resultats.add(stagiaire);
            }
        }
        return resultats;
    }



    @Override
    public void create(Stagiaire obj) {
        List<Stagiaire> stagiaires = read();
        boolean presentDansFichier = false;
        for (Stagiaire stagiaire: stagiaires) {
            if (stagiaire.getId() == obj.getId()) {
                presentDansFichier = true;
            }
        }

        if(presentDansFichier) {
            stagiaires.add(obj);
            write(stagiaires);
        }

    }



    @Override
    public Stagiaire update(Stagiaire obj) {
        List<Stagiaire> stagiaires = read();
        boolean presentDansFichier = false;
        int index =-1;
        for (Stagiaire stagiaire: stagiaires) {
            if (stagiaire.getId() == obj.getId()) {
                index = stagiaires.indexOf(stagiaire);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            stagiaires.set(index, obj);
            write(stagiaires);
        } else {
            System.out.println("Adresse non trouvée");
        }


        return obj;
    }



    @Override
    public List<Stagiaire> findAll() {
        return read();
    }


    @Override
    public Stagiaire find(Long id) {
        List<Stagiaire> stagiaires = read();
        for (Stagiaire stagiaire: stagiaires) {
            if (stagiaire.getId() == id) {
                return stagiaire;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {
        List<Stagiaire> stagiaires = read();
        boolean presentDansFichier = false;
        int index = -1;
        for (Stagiaire stagiaire: stagiaires) {
            if (stagiaire.getId() == id) {
                index = stagiaires.indexOf(stagiaire);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            stagiaires.remove(index);
            write(stagiaires);
        } else{
            throw  new Exception("Adresse non trouvée");
        }

    }


    /**
     * Méthode pour lire le fichier
     * @return
     */
    private List<Stagiaire> read(){
        // TODO
        return null;
    }

    /**
     * Méthode pour écrire le fichier
     * @return
     */
    private List<Stagiaire> write(List<Stagiaire> stagiaires){
        // TODO
        return null;
    }

}
