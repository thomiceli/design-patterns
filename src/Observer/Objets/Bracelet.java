package Observer.Objets;

public class Bracelet extends ObjetConnecte {

    @Override
    public String getMessage() {
        return super.message;
    }

    @Override
    public void setMessage(String s) {
        super.message = s;
        System.out.println("Le bracelet exécute l’activité correspondante au message " + s);
    }
}
