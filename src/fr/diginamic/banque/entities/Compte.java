package fr.diginamic.banque.entities;

public class Compte {
    private int numéroDeCompte;
    private double solde;
    private static int idCompte= 0 ;

    public Compte( double solde) {
        this.numéroDeCompte = idCompte;
        this.solde = solde;
        idCompte = idCompte +1;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numéroDeCompte=" + numéroDeCompte +
                ", solde=" + solde +
                '}';
    }

    public int getNuméroDeCompte() {
        return numéroDeCompte;
    }

    public void setNuméroDeCompte(int numéroDeCompte) {
        this.numéroDeCompte = numéroDeCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getIdCompte() {
        return idCompte;
    }

    public static void setIdCompte(int idCompte) {
        Compte.idCompte = idCompte;
    }
}
