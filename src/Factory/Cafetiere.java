package Factory;

public class Cafetiere implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On equipe la cafetière avec " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("On démarre la cafetière");
    }
}
