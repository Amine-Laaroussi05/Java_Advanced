package Dao;

import FormationData.Adresse;

import java.util.ArrayList;
import java.util.List;

public class AdresseDaoFile implements IDAOAdresse{


    @Override
    public List<Adresse> findByID(Long id) {
        List<Adresse> adresses = read();
        List<Adresse> resultats = new ArrayList<>();
        for (Adresse adresse: adresses){
            if (adresse.getId() == id) {
                resultats.add(adresse);
            }
        }
        return resultats;
    }



    @Override
    public void create(Adresse obj) {
        List<Adresse> adresses = read();
        boolean presentDansFichier = false;
        for (Adresse adresse: adresses) {
            if (adresse.getId() == obj.getId()) {
                presentDansFichier = true;
            }
        }

        if(presentDansFichier) {
            adresses.add(obj);
            write(adresses);
        }

    }



    @Override
    public Adresse update(Adresse obj) {
        List<Adresse> adresses = read();
        boolean presentDansFichier = false;
        int index =-1;
        for (Adresse adresse: adresses) {
            if (adresse.getId() == obj.getId()) {
                index = adresses.indexOf(adresse);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            adresses.set(index, obj);
            write(adresses);
        } else {
            System.out.println("Adresse non trouvée");
        }


        return obj;
    }



    @Override
    public List<Adresse> findAll() {
        return read();
    }


    @Override
    public Adresse find(Long id) {
        List<Adresse> adresses = read();
        for (Adresse adresse: adresses) {
            if (adresse.getId() == id) {
                return adresse;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {
        List<Adresse> adresses = read();
        boolean presentDansFichier = false;
        int index = -1;
        for (Adresse adresse: adresses) {
            if (adresse.getId() == id) {
                index = adresses.indexOf(adresse);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            adresses.remove(index);
            write(adresses);
        } else{
            throw  new Exception("Adresse non trouvée");
        }

    }


    /**
     * Méthode pour lire le fichier
     * @return
     */
    private List<Adresse> read(){
        // TODO
        return null;
    }

    /**
     * Méthode pour écrire le fichier
     * @return
     */
    private List<Adresse> write(List<Adresse> adresses){
        // TODO
        return null;
    }

}
