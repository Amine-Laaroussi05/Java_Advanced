package FormationData;

public class Adresse {

    /**
     * Attributes
     */
    private long id;
    private String rue;
    private String complement;
    private String codePostal;
    private String ville;
    private String pays;


    /**
     * Getters and setters
     * @return id, rue, complement, codePostal, ville, pays
     */
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRue() {
        return this.rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * Constructor
     */
    public Adresse() {
    }


    /**
     * Constructor
     * @param id : long
     * @param rue : String
     * @param complement : String
     * @param codePostal : String
     * @param ville : Stirng
     * @param pays : String
     */
    public Adresse(long id, String rue, String complement, String codePostal, String ville, String pays) {
        this.setId(id);
        this.setRue(rue);
        this.setComplement(complement);
        this.setCodePostal(codePostal);
        this.setVille(ville);
        this.setPays(pays);
    }




}
