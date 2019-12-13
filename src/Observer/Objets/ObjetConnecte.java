package Observer.Objets;

import Observer.Observateurs.Observateur;

public class ObjetConnecte implements Observateur {

    protected String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String s) {
        this.message = s;
        System.out.println("L'objet exécute l’activité correspondante au message " + s);
    }
}
