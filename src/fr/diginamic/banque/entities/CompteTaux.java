package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{
    double tauxDeRemunération;

    public CompteTaux(double solde, double tauxDeRemunération) {
        super(solde);
        this.tauxDeRemunération = tauxDeRemunération;
    }
    @Override
    public String toString() {
        return  "CompteTaux{" +
                "tauxDeRemunération=" + tauxDeRemunération +
                '}';
    }
}
