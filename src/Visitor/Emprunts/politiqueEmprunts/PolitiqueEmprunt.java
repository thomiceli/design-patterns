package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.documents.CD;
import Visitor.Emprunts.documents.Film;
import Visitor.Emprunts.documents.Livre;

import java.time.LocalDate;

public interface PolitiqueEmprunt {

    LocalDate calculerDateRetour(CD cd);

    LocalDate calculerDateRetour(Film film);

    LocalDate calculerDateRetour(Livre livre);
}
