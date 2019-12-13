package Factory;

public class Radiateur implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On equipe le radiateur avec " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("On démarre le radiateur");
    }
}
