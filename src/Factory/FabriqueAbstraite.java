package Factory;

public abstract class FabriqueAbstraite {

    public Connectable fabriquer(String type) throws ClassNotFoundException {
        Connectable obj = creer(type);
        return equiper(obj);
    }

    private Connectable creer(String type) throws ClassNotFoundException {
        Connectable objet;
        switch (type) {
            case "Radio":
                objet = new Radio();
                break;
            case "Cafetière":
                objet = new Cafetiere();
                break;
            case "Radiateur":
                objet = new Radiateur();
                break;
            default:
                throw new ClassNotFoundException();
        }
        return objet;
    }

    abstract Connectable equiper(Connectable obj);
}
