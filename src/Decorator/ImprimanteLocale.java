package Decorator;

public class ImprimanteLocale implements Imprimante {

    @Override
    public void imprimer() {
        System.out.println("Imprimante locale");
    }
}
