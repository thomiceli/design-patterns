package Visitor.Emprunts.politiqueEmprunts;

import Visitor.Emprunts.CalculDate;
import Visitor.Emprunts.documents.CD;
import Visitor.Emprunts.documents.Film;
import Visitor.Emprunts.documents.Livre;
import Visitor.Emprunts.emprunteurs.Emprunteur;

import java.time.LocalDate;

public class EmpruntSelonTypeDocAvantage implements PolitiqueEmprunt {

    private int bonusAdv = 0;
    private int bonusCardMus = 0;
    private int bonusCardLiv = 0;

    public EmpruntSelonTypeDocAvantage(Emprunteur emAdv, Emprunteur emCardM, Emprunteur emCardL) {
        if (emAdv != null) this.bonusAdv = emAdv.getBonus(new AvantageStatut());
        if (emCardM != null) this.bonusCardMus = emCardM.getBonus(new AvantageCarteMusique());
        if (emCardL != null) this.bonusCardLiv = emCardL.getBonus(new AvantageCarteLecteur());
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return CalculDate.ajouter(7 + bonusAdv + bonusCardMus);
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return CalculDate.ajouter(15 + bonusAdv);
    }

    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return CalculDate.ajouter(30 + bonusAdv + bonusCardLiv);
    }
}
