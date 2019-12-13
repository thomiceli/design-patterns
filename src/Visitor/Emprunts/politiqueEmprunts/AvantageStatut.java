package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.emprunteurs.*;

public class AvantageStatut implements AvantageEmprunteur {
    @Override
    public int getBonusEmprunteur(EmprunteurStandard em) {
        return 1;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurBronze em) {
        return 3;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurArgent em) {
        return 5;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurOr em) {
        return 10;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteLecture em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteMusique em) {
        return 0;
    }
}
