package Visitor.Emprunts.documents;

import Visitor.Emprunts.politiqueEmprunts.PolitiqueEmprunt;

import java.time.LocalDate;

public abstract class Document {

    private String titre;
    private LocalDate dateRetour;

    public Document(String titre) {
        this.titre = titre;
        this.dateRetour = null;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public abstract void emprunter(PolitiqueEmprunt pol);

}
