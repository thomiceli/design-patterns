package Visitor.Emprunts;

import Visitor.Emprunts.documents.Document;
import Visitor.Emprunts.emprunteurs.EmprunteurCarteLecture;
import Visitor.Emprunts.emprunteurs.EmprunteurCarteMusique;
import Visitor.Emprunts.emprunteurs.EmprunteurOr;
import Visitor.Emprunts.emprunteurs.EmprunteurStandard;
import Visitor.Emprunts.politiqueEmprunts.EmpruntSelonDateFixe;
import Visitor.Emprunts.politiqueEmprunts.EmpruntSelonTypeDoc;
import Visitor.Emprunts.politiqueEmprunts.EmpruntSelonTypeDocAvantage;
import org.junit.Test;

import java.time.LocalDate;

import static Visitor.Emprunts.GestionEmprunt.documents;
import static org.junit.Assert.assertEquals;

public class GestionEmpruntEx3Test {

    @Test
    public void testFixe_Livre() {
        GestionEmprunt.fondBiblio();
        Document doc = documents.get("LI_ORW_1");

        EmpruntSelonDateFixe em = new EmpruntSelonDateFixe();
        doc.emprunter(em);

        assertEquals(doc.getDateRetour(), LocalDate.now().plusDays(20));
    }

    @Test
    public void testFixe_LivreFilm() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");

        EmpruntSelonDateFixe em = new EmpruntSelonDateFixe();
        doc1.emprunter(em);
        doc2.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(20));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(20));
    }

    @Test
    public void testType_LivreFilm() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");

        EmpruntSelonTypeDoc em = new EmpruntSelonTypeDoc();
        doc1.emprunter(em);
        doc2.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15));
    }

    @Test
    public void testType_LivreFilmFilmCD() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");
        Document doc3 = documents.get("FI_SCO_1");
        Document doc4 = documents.get("CD_STO_1");

        EmpruntSelonTypeDoc em = new EmpruntSelonTypeDoc();
        doc1.emprunter(em);
        doc2.emprunter(em);
        doc3.emprunter(em);
        doc4.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15));
        assertEquals(doc3.getDateRetour(), LocalDate.now().plusDays(15));
        assertEquals(doc4.getDateRetour(), LocalDate.now().plusDays(7));
    }

    @Test
    public void testTypeAdv_LivreFilm_standard() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurStandard(), null, null);
        doc1.emprunter(em);
        doc2.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30).plusDays(1));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15).plusDays(1));
    }

    @Test
    public void testTypeAdv_LivreFilmCD_or() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");
        Document doc3 = documents.get("CD_BEA_1");

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurOr(), null, null);
        doc1.emprunter(em);
        doc2.emprunter(em);
        doc3.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30).plusDays(10));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15).plusDays(10));
        assertEquals(doc3.getDateRetour(), LocalDate.now().plusDays(7).plusDays(10));
    }

    @Test
    public void testTypeAdv_LivreFilmCD_or_advLec() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");
        Document doc3 = documents.get("CD_BEA_1");

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurOr(), null, new EmprunteurCarteLecture());
        doc1.emprunter(em);
        doc2.emprunter(em);
        doc3.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30).plusDays(10).plusDays(20));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15).plusDays(10));
        assertEquals(doc3.getDateRetour(), LocalDate.now().plusDays(7).plusDays(10));
    }

    @Test
    public void testTypeAdv_LivreFilmCD_or_advMus() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");
        Document doc3 = documents.get("CD_BEA_1");

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurOr(), new EmprunteurCarteMusique(), null);
        doc1.emprunter(em);
        doc2.emprunter(em);
        doc3.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30).plusDays(10));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15).plusDays(10));
        assertEquals(doc3.getDateRetour(), LocalDate.now().plusDays(7).plusDays(10).plusDays(20));
    }

    @Test
    public void testTypeAdv_LivreFilmCD_or_advMus_advLec() {
        GestionEmprunt.fondBiblio();
        Document doc1 = documents.get("LI_ORW_1");
        Document doc2 = documents.get("FI_KUB_1");
        Document doc3 = documents.get("CD_BEA_1");

        EmpruntSelonTypeDocAvantage em = new EmpruntSelonTypeDocAvantage(new EmprunteurOr(), new EmprunteurCarteMusique(), new EmprunteurCarteLecture());
        doc1.emprunter(em);
        doc2.emprunter(em);
        doc3.emprunter(em);

        assertEquals(doc1.getDateRetour(), LocalDate.now().plusDays(30).plusDays(10).plusDays(20));
        assertEquals(doc2.getDateRetour(), LocalDate.now().plusDays(15).plusDays(10));
        assertEquals(doc3.getDateRetour(), LocalDate.now().plusDays(7).plusDays(10).plusDays(20));
    }
}