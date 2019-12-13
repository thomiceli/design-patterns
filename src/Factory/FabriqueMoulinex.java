package Factory;

public class FabriqueMoulinex extends FabriqueAbstraite {

    @Override
    Connectable equiper(Connectable obj) {
        obj.equiper("gadget Moulinex");
        return obj;
    }
}
