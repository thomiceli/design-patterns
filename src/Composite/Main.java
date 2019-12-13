package Composite;

public class Main {
    public static void main(String[] args) {

        Expression e1 = new NoeudInterne(new Nombre(5),
                new Nombre(4),
                '*');

        Expression e2 = new NoeudInterne(new Nombre(1),
                new Nombre(3),
                '+');

        Expression e3 = new NoeudInterne(e1, e2, '-');

        double a = e3.calculerValeur(); // (5 * 4) - (1 + 3)
        System.out.println(a);

    }
}
