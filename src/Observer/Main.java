package Observer;

import Observer.Objets.Bracelet;
import Observer.Objets.Montre;
import Observer.Objets.Smartphone;
import Observer.Observateurs.AgenceEspionnage;
import Observer.Observateurs.MagasinSportFavori;

public class Main {
    public static void main(String[] args) {
        Montre montre = new Montre();
        Bracelet bracelet = new Bracelet();
        Smartphone smartphone = new Smartphone();

        MagasinSportFavori magasinSportFavori = new MagasinSportFavori();

        magasinSportFavori.add(montre);
        magasinSportFavori.add(bracelet);

        AgenceEspionnage agenceEspionnage = new AgenceEspionnage();

        agenceEspionnage.add(montre);
        agenceEspionnage.add(bracelet);
        agenceEspionnage.add(smartphone);

        System.out.println("--- Action à l'objet connecté ---");
        montre.setMessage("Action sur la montre");
        smartphone.setMessage("Action sur le smartphone");
        bracelet.setMessage("Action sur le bracelet");

        System.out.println("\n--- Espionnage du magasin de sport ---");
        magasinSportFavori.espionner();
        System.out.println("\n--- Espionnage de l'agence d'espionnage ---");
        agenceEspionnage.espionner();
    }
}