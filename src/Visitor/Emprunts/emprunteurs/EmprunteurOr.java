package Visitor.Emprunts.emprunteurs;

import Visitor.Emprunts.politiqueEmprunts.AvantageEmprunteur;

public class EmprunteurOr implements Emprunteur {
    @Override
    public int getBonus(AvantageEmprunteur ae) {
        return ae.getBonusEmprunteur(this);

    }
}
