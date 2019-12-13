package Visitor.Emprunts.documents;

import Visitor.Emprunts.politiqueEmprunts.PolitiqueEmprunt;

public class Livre extends Document {
    public Livre(String titre) {
        super(titre);
    }

    @Override
    public void emprunter(PolitiqueEmprunt pol) {
        super.setDateRetour(pol.calculerDateRetour(this));
    }


    public String toString() {
        String str = "Titre du livre: \"" + super.getTitre() + "\"\n";

        if (super.getDateRetour() == null) {
            return str += "Pas emprunté.\n-----------------------";
        }
        return str += "Emprunté. Retour le " + super.getDateRetour() + ".\n-----------------------";
    }
}
