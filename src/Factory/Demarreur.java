package Factory;

import java.util.ArrayList;

public class Demarreur {

    private ArrayList<Connectable> actives = new ArrayList<>();

    public ArrayList<Connectable> getActives() {
        return actives;
    }

    public void demarrerLesActives() {
        for (Connectable active : actives) {
            active.demarrer();
        }
    }

    public void attacher(Connectable obj) {
        actives.add(obj);
    }

    public void detacher(Connectable obj) {
        actives.remove(obj);
    }

}
