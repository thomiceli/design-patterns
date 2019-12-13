package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.emprunteurs.*;

public interface AvantageEmprunteur {

    int getBonusEmprunteur(EmprunteurStandard em);

    int getBonusEmprunteur(EmprunteurBronze em);

    int getBonusEmprunteur(EmprunteurArgent em);

    int getBonusEmprunteur(EmprunteurOr em);

    int getBonusEmprunteur(EmprunteurCarteLecture em);

    int getBonusEmprunteur(EmprunteurCarteMusique em);
}
