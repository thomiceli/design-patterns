package Visitor.Emprunts.documents;

import Visitor.Emprunts.politiqueEmprunts.PolitiqueEmprunt;

public class Film extends Document {

    public Film(String titre) {
        super(titre);
    }

    @Override
    public void emprunter(PolitiqueEmprunt pol) {
        super.setDateRetour(pol.calculerDateRetour(this));
    }

    public String toString() {
        String str = "Titre du film: \"" + super.getTitre() + "\"\n";

        if (super.getDateRetour() == null) {
            return str += "Pas emprunté.\n-----------------------";
        }
        return str += "Emprunté. Retour le " + super.getDateRetour() + ".\n-----------------------";
    }
}
