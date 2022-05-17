package DaoDemo;

import io.Voiture;

import java.util.ArrayList;
import java.util.List;

public class VoitureDaoFile implements IDAOVoiture{
    @Override
    public List<Voiture> findByCouleur(String couleur) {
            List<Voiture> voitures = read();
            List<Voiture> resultats = new ArrayList<>();
            for (Voiture voiture: voitures) {
                if (voiture.getCouleur() == couleur){
                    resultats.add(voiture); // la voiture qui nous intéresse
                }
            }
            return resultats;
    }

    @Override
    public void create(Voiture obj) {
        List<Voiture> voitures = read(); // voir cours lecture fichier
        boolean presentDansFichier = false;
        for (Voiture voiture: voitures) {
            if (voiture.getNom() == obj.getNom()) { // on veut une voiture différente de celle ci (obj)
                presentDansFichier = true; // on inverse notre interrupteur
            }
        }

        // ajoute à mon fichier s'il n'y est pas
        if (!presentDansFichier) {
            voitures.add(obj);
            write(voitures); // voir cours écriture fichier

        }

    }

    @Override
    public Voiture update(Voiture obj) {
        List<Voiture> voitures = read(); // voir cours lecture fichier
        boolean presentDansFichier = false;
        int index = -1;
        for (Voiture voiture: voitures) {
            if (voiture.getNom() == obj.getNom()) { // on veut une voiture différente de celle ci (obj)
                index = voitures.indexOf(voiture);
                presentDansFichier = true; // on inverse notre interrupteur
            }
        }

        if (presentDansFichier && index != -1){
            voitures.set(index, obj);
            write(voitures);
        } else{
            System.out.println("Voiture non trouvée");
        }

        return obj;
    }

    @Override
    public List<Voiture> findAll() {
        return read();
    }

    @Override
    public Voiture find(String id) {
        List<Voiture> voitures = read();
        for (Voiture voiture: voitures) {
            if (voiture.getNom() == id){
                return voiture; // la voiture qui nous intéresse
            }
        }
        return null;
    }



    @Override
    public void delete(String id) throws Exception {
        List<Voiture> voitures = read(); // voir cours lecture fichier
        boolean presentDansFichier = false;
        int index = -1;
        for (Voiture voiture: voitures) {
            if (voiture.getNom() == id) { // on veut une voiture différente de celle ci (obj)
                index = voitures.indexOf(voiture);
                presentDansFichier = true; // on inverse notre interrupteur
            }
        }

        if (presentDansFichier && index != -1){
            voitures.remove(index);
            write(voitures);
        } else{
            throw new Exception("Voiture non trouvée ");
        }
    }


    /**
     * Méthode pour lire mon fichier
     * @return
     */
    private List<Voiture> read(){
        // TODO
        return null;
    }

    /**
     * Méthode écriture de fichier
     * @param voitures
     */
    private void write(List<Voiture> voitures) {

    }
}
