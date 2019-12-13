package Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("i1");
        Imprimante i1 = new Fax(new Scan(new ImprimanteReseau()));
        i1.imprimer();
        System.out.println();

        System.out.println("i2");
        Imprimante i2 = new Photocopieur(new ImprimanteReseau());
        i2.imprimer();
        System.out.println();

        System.out.println("i3");
        Imprimante i3 = new ImprimanteReseau();
        i3.imprimer();
        System.out.println();

        System.out.println("i4");
        Imprimante i4 = new Fax(new Scan(new Photocopieur(new ImprimanteReseau())));
        i4.imprimer();
    }
}
