package FormationData;

import java.util.ArrayList;
import java.util.List;

public class Matiere {


    /**
     * Attributes
     */
    private long id;
    private String nom;
    private int duree;
    private Difficulte difficulte;
    private List<Formateur> formateurs = new ArrayList<>();






    /**
     * Getters & Setters
     * @return id, nom, duree,
     */
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Difficulte getDifficulte() {
        return this.difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public List<Formateur> getFormateurs() {
        return this.formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
    }








    /**
     * Constructor
     * @param id : long
     * @param nom : String
     * @param duree : int
     * @param difficulte : Difficulte
     * @param formateurs : List Formateur
     */
    public Matiere(long id, String nom, int duree, Difficulte difficulte, List<Formateur> formateurs) {
        this.setId(id);
        this.setNom(nom);
        this.setDuree(duree);
        this.setDifficulte(difficulte);
        this.setFormateurs(formateurs);
    }




}
