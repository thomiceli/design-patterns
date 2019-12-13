package Visitor.Noeud;

public class VisiteurConcret implements Visiteur {

    private String text = "";

    @Override
    public void visiter(NoeudInterne n) {
        switch (n.getOperateurBinaire()) {
            case '+':
                this.text += "plus ";
                break;
            case '-':
                this.text += "moins ";
                break;
            case '*':
                this.text += "fois ";
                break;
            case '/':
                this.text += "divisé par ";
                break;
        }
    }

    @Override
    public void visiter(Nombre n) {
        switch (n.getValeur()) {
            case 0:
                this.text += "zero ";
                break;
            case 1:
                this.text += "un ";
                break;
            case 2:
                this.text += "deux ";
                break;
            case 3:
                this.text += "trois ";
                break;
            case 4:
                this.text += "quatre ";
                break;
            case 5:
                this.text += "cinq ";
                break;
            case 6:
                this.text += "six ";
                break;
            case 7:
                this.text += "sept ";
                break;
            case 8:
                this.text += "huit ";
                break;
            case 9:
                this.text += "neuf ";
                break;

        }

    }

    @Override
    public String getTexte() {
        return this.text;
    }
}
