package Factory;

public class Radio implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On equipe la radio avec " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("On démarre la radio");
    }
}
