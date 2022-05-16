package FormationData;

public abstract class Personne {


    /**
     * Attributes
     */
    private Civilite civilite;
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private Adresse adresse;

    public Personne() {
    }


    /**
     * Getters & Setters
     * @return id, nom, prenom, email, adress
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

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }



    /**
     * Constructor:
     * sans l'adresse
     * @param nom : String
     * @param prenom : String
     * @param email : String
     */
    public Personne(String nom, String prenom, String email, Civilite civilite) {
        super();
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setEmail(email);
        this.setCivilite(civilite);
    }


    /**
     * Constructor
     * @param id : long
     * @param nom : String
     * @param prenom : String
     * @param email : String
     * @param adresse : Adresse
     */
    public Personne(String nom, String prenom, String email, Adresse adresse, Civilite civilite) {
        super();
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setEmail(email);
        this.setAdresse(adresse);
        this.setCivilite(civilite);
    }





}
