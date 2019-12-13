package Visitor.Noeud;

public class NoeudInterne extends Expression {

    private Expression val1;
    private Expression val2;
    private char operateurBinaire;

    public NoeudInterne(Expression val1, Expression val2, char operateurBinaire) {
        this.val1 = val1;
        this.val2 = val2;
        this.operateurBinaire = operateurBinaire;

    }

    public char getOperateurBinaire() {
        return operateurBinaire;
    }

    public double calculerValeur() {
        Expression val1 = this.val1;
        Expression val2 = this.val2;
        char op = this.operateurBinaire;
        double result;

        switch (op) {

            case '+':
                result = val1.calculerValeur() + val2.calculerValeur();
                break;
            case '-':
                result = val1.calculerValeur() - val2.calculerValeur();
                break;
            case '*':
                result = val1.calculerValeur() * val2.calculerValeur();
                break;
            case '/':
                result = val1.calculerValeur() / val2.calculerValeur();
                break;
            default:
                System.out.println("Mauvais opérateur");
                result = 0;
                break;
        }

        return result;

    }

    @Override
    public void accepter(Visiteur v) {
        if (val1 != null)
            val1.accepter(v);

        v.visiter(this);
        val2.accepter(v);
    }
}
