package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte Compte1 = new Compte(1000.99);
        Compte Compte2 = new Compte(1000.99);
        System.out.println(Compte1.getNuméroDeCompte());
    }
}
