package Visitor.Noeud;

public interface Visiteur {

    void visiter(NoeudInterne noeudInterne);

    void visiter(Nombre nombre);

    String getTexte();


}
