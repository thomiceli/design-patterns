package Visitor.Emprunts.emprunteurs;

import Visitor.Emprunts.politiqueEmprunts.AvantageEmprunteur;

public class EmprunteurCarteLecture implements Emprunteur {
    @Override
    public int getBonus(AvantageEmprunteur ae) {
        return ae.getBonusEmprunteur(this);

    }
}
