package Factory;

public class FabriqueSony extends FabriqueAbstraite {

    @Override
    Connectable equiper(Connectable obj) {
        obj.equiper("gadget Sony");
        return obj;
    }
}
