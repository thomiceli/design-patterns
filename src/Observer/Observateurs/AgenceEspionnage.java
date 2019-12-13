package Observer.Observateurs;

import java.util.ArrayList;
import java.util.List;

public class AgenceEspionnage implements IObjetConnecte {

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
            System.out.println("Attention à tous les agents secrets, le message \"" + obs.getMessage() + "\" a été reçu");
            System.out.println("Ceci est un message secret");
        }
    }
}
