package Decorator;

public class Scan extends ImprimanteMultifonction {

    public Scan(Imprimante i) {
        this.imp = i;
    }


    public void imprimer() {
        imp.imprimer();
        System.out.println("La fonction scan est activée");
    }
}
