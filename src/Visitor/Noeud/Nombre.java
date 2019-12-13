package Visitor.Noeud;

public class Nombre extends Expression implements Visitable {

    private int valeur;

    Nombre(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public double calculerValeur() {
        return this.valeur;
    }

    @Override
    public void accepter(Visiteur v) {
        v.visiter(this);
    }
}