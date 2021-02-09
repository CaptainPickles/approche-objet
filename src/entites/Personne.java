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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom.toUpperCase() + '\'' +
                ", prénom='" + prénom + '\'' +
                '}';
    }
}
