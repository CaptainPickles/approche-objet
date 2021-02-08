package entites;

public class Personne {
    private String nom;
    private String prénom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prénom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prénom = prénom;
        this.adressePostale = adressePostale;
    }
}
