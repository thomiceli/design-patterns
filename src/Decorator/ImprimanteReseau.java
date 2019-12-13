package Decorator;

public class ImprimanteReseau implements Imprimante {

    @Override
    public void imprimer() {
        System.out.println("Imprimante en réseau");
    }
}
