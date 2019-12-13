package Visitor.Emprunts.documents;

import Visitor.Emprunts.politiqueEmprunts.PolitiqueEmprunt;

public class CD extends Document {
    public CD(String titre) {
        super(titre);
    }

    @Override
    public void emprunter(PolitiqueEmprunt pol) {
        super.setDateRetour(pol.calculerDateRetour(this));
    }


    public String toString() {
        String str = "Titre du CD: \"" + super.getTitre() + "\"\n";

        if (super.getDateRetour() == null) {
            return str += "Pas emprunté.\n-----------------------";
        }
        return str += "Emprunté. Retour le " + super.getDateRetour() + ".\n-----------------------";
    }
}
