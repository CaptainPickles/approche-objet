package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne Personne1 = new Personne("bibou","michel", new AdressePostale(13, "rue des plats", 94240,"l'hay-les roses" ));
        Personne Personne2 = new Personne("sins", "jhonny", new AdressePostale(13, "rue des plats", 94240,"l'hay-les roses" ));
        Personne1.setNom("babou");
        System.out.println(Personne1);
    }
}
