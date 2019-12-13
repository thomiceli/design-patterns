package Observer.Objets;

public class Smartphone extends ObjetConnecte {

    @Override
    public String getMessage() {
        return super.message;
    }

    @Override
    public void setMessage(String s) {
        super.message = s;
        System.out.println("Le smartphone exécute l’activité correspondante au message " + s);
    }
}
