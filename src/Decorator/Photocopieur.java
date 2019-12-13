package Decorator;

public class Photocopieur extends ImprimanteMultifonction {


    public Photocopieur(Imprimante i) {
        this.imp = i;
    }

    public void imprimer() {
        imp.imprimer();
        System.out.println("La fonction photocopieur est activée");
    }
}
