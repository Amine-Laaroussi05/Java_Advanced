package Dao;

import FormationData.Matiere;

import java.util.ArrayList;
import java.util.List;

public class MatiereDaoFile implements IDAOMatiere{


    @Override
    public List<Matiere> findByID(Long id) {
        List<Matiere> matieres = read();
        List<Matiere> resultats = new ArrayList<>();
        for (Matiere matiere: matieres){
            if (matiere.getId() == id) {
                resultats.add(matiere);
            }
        }
        return resultats;
    }



    @Override
    public void create(Matiere obj) {
        List<Matiere> matieres = read();
        boolean presentDansFichier = false;
        for (Matiere matiere: matieres) {
            if (matiere.getId() == obj.getId()) {
                presentDansFichier = true;
            }
        }

        if(presentDansFichier) {
            matieres.add(obj);
            write(matieres);
        }

    }



    @Override
    public Matiere update(Matiere obj) {
        List<Matiere> matieres = read();
        boolean presentDansFichier = false;
        int index =-1;
        for (Matiere matiere: matieres) {
            if (matiere.getId() == obj.getId()) {
                index = matieres.indexOf(matiere);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            matieres.set(index, obj);
            write(matieres);
        } else {
            System.out.println("Adresse non trouvée");
        }


        return obj;
    }



    @Override
    public List<Matiere> findAll() {
        return read();
    }


    @Override
    public Matiere find(Long id) {
        List<Matiere> matieres = read();
        for (Matiere matiere: matieres) {
            if (matiere.getId() == id) {
                return matiere;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {
        List<Matiere> matieres = read();
        boolean presentDansFichier = false;
        int index = -1;
        for (Matiere matiere: matieres) {
            if (matiere.getId() == id) {
                index = matieres.indexOf(matiere);
                presentDansFichier = true;
            }
        }

        if (presentDansFichier && index != -1) {
            matieres.remove(index);
            write(matieres);
        } else{
            throw  new Exception("Adresse non trouvée");
        }

    }


    /**
     * Méthode pour lire le fichier
     * @return
     */
    private List<Matiere> read(){
        // TODO
        return null;
    }

    /**
     * Méthode pour écrire le fichier
     * @return
     */
    private List<Matiere> write(List<Matiere> matieres){
        // TODO
        return null;
    }

}

