package FormationData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Formateur extends Personne{


    /**
     * Attributes
     */
    private Date dtEmbauche;
    private int experience;
    private boolean interne;
    private List<Matiere> matieres = new ArrayList<>();
    private List<Stagiaire> stagiaires = new ArrayList<>();




    /**
     * Getters & Setters
     * @return
     */
    public Date getDtEmbauche() {
        return this.dtEmbauche;
    }

    public void setDtEmbauche(Date dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isInterne() {
        return this.interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }

    public List<Matiere> getMatieres() {
        return this.matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public List<Stagiaire> getStagiaires() {
        return this.stagiaires;
    }

    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }








    /**
     * Constructors
     * sans matiere et sans adresse
     * @param id : long
     * @param nom : String
     * @param prenom : String
     * @param email : String
     * @param dtEmbauche : Date
     * @param experience : int
     * @param interne : boolean
     * @param stagiaires : List Stagiaire
     */
    public Formateur(Civilite civilite, String nom, String prenom, String email, Date dtEmbauche, int experience, boolean interne, List<Stagiaire> stagiaires) {
        super(nom, prenom, email, civilite);
        this.setDtEmbauche(dtEmbauche);
        this.setExperience(experience);
        this.setInterne(interne);
        this.setStagiaires(stagiaires);
    }


    /**
     * Constructor
     * + matiere - adresse
     * @param nom : String
     * @param prenom : String
     * @param email : String
     * @param adresse : String
     * @param dtEmbauche : Date
     * @param experience : int
     * @param interne : boolean
     * @param stagiaires : List Stagiaire
     */
    public Formateur(Civilite civilite, String nom, String prenom, String email, Adresse adresse, Date dtEmbauche, int experience, boolean interne, List<Stagiaire> stagiaires) {
        super(nom, prenom, email, adresse, civilite);
        this.setDtEmbauche(dtEmbauche);
        this.setExperience(experience);
        this.setInterne(interne);
        this.setStagiaires(stagiaires);
    }


    /**
     * Constructor
     * + matiere - adresse
     * @param nom : String
     * @param prenom : String
     * @param email : String
     * @param dtEmbauche : Date
     * @param experience : int
     * @param interne : boolean
     * @param matieres : List Matiere
     * @param stagiaires : List Stagiaire
     */
    public Formateur(Civilite civilite, String nom, String prenom, String email, Date dtEmbauche, int experience, boolean interne, List<Matiere> matieres, List<Stagiaire> stagiaires) {
        super(nom, prenom, email, civilite);
        this.setDtEmbauche(dtEmbauche);
        this.setExperience(experience);
        this.setInterne(interne);
        this.setMatieres(matieres);
        this.setStagiaires(stagiaires);
    }


    /**
     * Constructor
     * + adresse + matiere
     * @param nom : String
     * @param prenom : String
     * @param email : String
     * @param adresse : String
     * @param dtEmbauche : Date
     * @param experience : int
     * @param interne : boolean
     * @param matieres : List Matiere
     * @param stagiaires : List Stagiaire
     */
    public Formateur(Civilite civilite, String nom, String prenom, String email, Adresse adresse, Date dtEmbauche, int experience, boolean interne, List<Matiere> matieres, List<Stagiaire> stagiaires) {
        super(nom, prenom, email, adresse, civilite);
        this.setDtEmbauche(dtEmbauche);
        this.setExperience(experience);
        this.setInterne(interne);
        this.setMatieres(matieres);
        this.setStagiaires(stagiaires);
    }
}
