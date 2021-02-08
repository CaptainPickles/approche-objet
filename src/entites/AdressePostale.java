package entites;

public class AdressePostale {
    private int numéroDeRue;
    private String  libélléDeRue;
    private int cdePostale;
    private String ville ;

    public AdressePostale(int numéroDeRue, String libélléDeRue, int cdePostale, String ville) {
        this.numéroDeRue = numéroDeRue;
        this.libélléDeRue = libélléDeRue;
        this.cdePostale = cdePostale;
        this.ville = ville;
    }

    public int getNuméroDeRue() {
        return numéroDeRue;
    }

    public void setNuméroDeRue(int numéroDeRue) {
        this.numéroDeRue = numéroDeRue;
    }

    public String getLibélléDeRue() {
        return libélléDeRue;
    }

    public void setLibélléDeRue(String libélléDeRue) {
        this.libélléDeRue = libélléDeRue;
    }

    public int getCdePostale() {
        return cdePostale;
    }

    public void setCdePostale(int cdePostale) {
        this.cdePostale = cdePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
