package Observer.Objets;

public class Montre extends ObjetConnecte {

    @Override
    public String getMessage() {
        return super.message;
    }

    @Override
    public void setMessage(String s) {
        super.message = s;
        System.out.println("La montre exécute l’activité correspondante au message \"" + s + "\"");
    }
}
