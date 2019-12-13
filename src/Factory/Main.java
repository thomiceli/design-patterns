package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Connectable> objets = new ArrayList<Connectable>();
    private static Demarreur demarreur = new Demarreur();


    public static void main(String[] args) throws ClassNotFoundException {
        FabriqueAbstraite fabriqueMoulinex = new FabriqueMoulinex();
        FabriqueAbstraite fabriqueSony = new FabriqueSony();

        objets.add(fabriqueMoulinex.fabriquer("Radio"));
        objets.add(fabriqueMoulinex.fabriquer("Cafetière"));
        objets.add(fabriqueMoulinex.fabriquer("Radiateur"));
        objets.add(fabriqueSony.fabriquer("Radio"));
        objets.add(fabriqueSony.fabriquer("Cafetière"));
        objets.add(fabriqueSony.fabriquer("Radiateur"));


        activer();
        demarreur.demarrerLesActives();
        desactiver();

        System.out.print(demarreur.getActives());
    }

    public static void activer() {
        for (Connectable objet : objets) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String choix = "aa";
            System.out.println("Activer l'objet " + objet + " objet ? (Entrer 'o')");
            try {
                choix = (in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (choix.equals("o"))
                demarreur.attacher(objet);

        }
    }

    public static void desactiver() {
        for (int i = 0; i < demarreur.getActives().size(); ++i) {

            Connectable objet = demarreur.getActives().get(i);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String choix = "aa";
            System.out.println("Désactiver l'objet " + objet + " objet ? (Entrer 'o')");
            try {
                choix = (in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (choix.equals("o")) {
                demarreur.detacher(objet);
                --i;
            }
        }
    }
}
