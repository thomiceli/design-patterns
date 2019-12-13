package Observer.Observateurs;

import java.util.ArrayList;
import java.util.List;

public class MagasinSportFavori implements IObjetConnecte {

    private List<Observateur> observateurs = new ArrayList<>();

    @Override
    public void add(Observateur obs) {
        observateurs.add(obs);
    }

    @Override
    public void remove(Observateur obs) {
        observateurs.remove(obs);
    }

    @Override
    public void espionner() {
        for (Observateur obs : observateurs) {
            System.out.println("Message aux vendeurs, l’objet connecté " + obs.getClass().getSimpleName() + " a recu le message : \"" + obs.getMessage() + "\"");
            System.out.println("Préparez un produit correspondant dans votre magasin");
        }
    }
}
