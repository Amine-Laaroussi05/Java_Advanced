package FormationData;

import java.util.Date;

public class Stagiaire {

    /**
     * Attributes
     */
    private Date dtNaissance;
    private Formateur formateur;




    /**
     * Getters & Setters
     * @return
     */
    public Date getDtNaissance() {
        return this.dtNaissance;
    }

    public Formateur getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public void setDtNaissance(Date dtNaissance) {
        this.dtNaissance = dtNaissance;
    }





    /**
     * Constructor
     * non formateur
     * @param dtNaissance : Date
     */
    public Stagiaire(Date dtNaissance) {
        this.dtNaissance = dtNaissance;
    }






    /**
     * Constructor
     * @param dtNaissance : Date
     * @param formateur : Formateur
     */
    public Stagiaire(Date dtNaissance, Formateur formateur) {
        this.dtNaissance = dtNaissance;
        this.setFormateur(formateur);
    }






}
