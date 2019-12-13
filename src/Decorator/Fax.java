package Decorator;

public class Fax extends ImprimanteMultifonction {

    public Fax(Imprimante i) {
        this.imp = i;
    }

    public void imprimer() {
        imp.imprimer();
        System.out.println("La fonction fax est activée");
    }
}
