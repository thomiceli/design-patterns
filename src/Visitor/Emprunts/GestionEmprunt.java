package Visitor.Emprunts;

import Visitor.Emprunts.documents.CD;
import Visitor.Emprunts.documents.Document;
import Visitor.Emprunts.documents.Film;
import Visitor.Emprunts.documents.Livre;
import Visitor.Emprunts.emprunteurs.EmprunteurArgent;
import Visitor.Emprunts.emprunteurs.EmprunteurCarteLecture;
import Visitor.Emprunts.emprunteurs.EmprunteurCarteMusique;
import Visitor.Emprunts.politiqueEmprunts.EmpruntSelonTypeDocAvantage;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionEmprunt {

    public static HashMap<String, Document> documents = new HashMap<>();
    private static ArrayList<Document> panier = new ArrayList<>();


    public static void fondBiblio() {
        documents.put("LI_ORW_1", new Livre("1984"));
        documents.put("LI_TOL_1", new Livre("Le seigneur des anneaux"));
        documents.put("CD_STO_1", new CD("Satisfaction"));
        documents.put("CD_BEA_1", new CD("Abbey Road"));
        documents.put("FI_KUB_1", new Film("2001 Odyssée de l'espace"));
        documents.put("FI_SCO_1", new Film("Taxi Driver"));
    }

    public static void emprunter(ArrayList<Document> emprunts) {

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurArgent(), new EmprunteurCarteMusique(), new EmprunteurCarteLecture());
        //EmpruntSelonDateFixe em = new EmpruntSelonDateFixe();

        for (Document doc : emprunts) {
            doc.emprunter(em);
            panier.add(doc);
        }
    }


    public static void main(String[] args) {
        fondBiblio();

        ArrayList<Document> e = new ArrayList<>();
        e.add(documents.get("LI_ORW_1"));
        e.add(documents.get("LI_TOL_1"));
        e.add(documents.get("FI_SCO_1"));

        emprunter(e);

        System.out.println(documents.get("LI_ORW_1").toString());
        System.out.println(documents.get("LI_TOL_1").toString());
        System.out.println(documents.get("CD_STO_1").toString());
        System.out.println(documents.get("CD_BEA_1").toString());
        System.out.println(documents.get("FI_KUB_1").toString());
        System.out.println(documents.get("FI_SCO_1").toString());
    }
}
