package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.CalculDate;
import Visitor.Emprunts.documents.CD;
import Visitor.Emprunts.documents.Film;
import Visitor.Emprunts.documents.Livre;

import java.time.LocalDate;

public class EmpruntSelonTypeDoc implements PolitiqueEmprunt {
    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return CalculDate.ajouter(7);
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return CalculDate.ajouter(15);
    }

    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return CalculDate.ajouter(30);
    }
}
