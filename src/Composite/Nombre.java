package Composite;

public class Nombre extends Expression {

    private int valeur;

    Nombre(int valeur) {
        this.valeur = valeur;
    }

    public double calculerValeur() {
        return this.valeur;
    }
}
