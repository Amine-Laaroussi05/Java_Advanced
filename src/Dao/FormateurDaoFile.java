package Dao;

import FormationData.Formateur;

import java.util.ArrayList;
import java.util.List;

public class FormateurDaoFile implements IDAOFormateur{


    @Override
    public List<Formateur> findByID(Long id) {
        List<Formateur> formateurs = read();
        List<Formateur> resultats = new ArrayList<>();
        for (Formateur formateur: formateurs){
            if (formateur.getId() == id) {
                resultats.add(formateur);
            }
        }
        return resultats;
    }



    @Override
    public void create(Formateur obj) {
        List<Formateur> formateurs = read();
        boolean presentDansFichier = false;
        for (Formateur formateur: formateurs) {
            if (formateur.getId() == obj.getId()) {
                presentDansFichier = true;
            }
        }

        if(presentDansFichier) {
            formateurs.add(obj);
            write(formateurs);
        }

    }



    @Override
    public Formateur update(Formateur obj) {
        List<Formateur> formateurs = read();
        boolean presentDansFichier = false;
        int index =-1;
        for (Formateur formateur: formateurs) {
            if (formateur.getId() == obj.getId()) {
                index = formateurs.indexOf(formateur);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            formateurs.set(index, obj);
            write(formateurs);
        } else {
            System.out.println("Adresse non trouvée");
        }


        return obj;
    }



    @Override
    public List<Formateur> findAll() {
        return read();
    }


    @Override
    public Formateur find(Long id) {
        List<Formateur> formateurs = read();
        for (Formateur formateur: formateurs) {
            if (formateur.getId() == id) {
                return formateur;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {
        List<Formateur> formateurs = read();
        boolean presentDansFichier = false;
        int index = -1;
        for (Formateur formateur: formateurs) {
            if (formateur.getId() == id) {
                index = formateurs.indexOf(formateur);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            formateurs.remove(index);
            write(formateurs);
        } else{
            throw  new Exception("Adresse non trouvée");
        }

    }


    /**
     * Méthode pour lire le fichier
     * @return
     */
    private List<Formateur> read(){
        // TODO
        return null;
    }

    /**
     * Méthode pour écrire le fichier
     * @return
     */
    private List<Formateur> write(List<Formateur> formateurs){
        // TODO
        return null;
    }

}
