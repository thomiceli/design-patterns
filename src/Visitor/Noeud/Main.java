package Visitor.Noeud;

public class Main {
    public static void main(String[] args) {

        Expression e1 = new NoeudInterne(new Nombre(5),
                new Nombre(4),
                '*');

        Expression e2 = new NoeudInterne(e1,
                new Nombre(1),
                '-');

        Expression e3 = new NoeudInterne(e2, new Nombre(3), '+');
        double a = e3.calculerValeur();  // (5 * 4) - (1 + 3)

        VisiteurConcret visiteurConcret = new VisiteurConcret();

        e3.accepter(visiteurConcret);

        System.out.println(visiteurConcret.getTexte());

    }
}
