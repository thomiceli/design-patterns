package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.emprunteurs.*;

public class AvantageCarteMusique implements AvantageEmprunteur {
    @Override
    public int getBonusEmprunteur(EmprunteurStandard em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurBronze em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurArgent em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurOr em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteLecture em) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteMusique em) {
        return 20;
    }
}
