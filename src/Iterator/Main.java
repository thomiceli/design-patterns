package Iterator;

public class Main {
    public static void main(String[] args) {

        ArbreBinaire<String> a1 = new ArbreBinaire<>("1");
        ArbreBinaire<String> a2 = new ArbreBinaire<>("2");
        ArbreBinaire<String> a3 = new ArbreBinaire<>("3");
        ArbreBinaire<String> a4 = new ArbreBinaire<>("4");
        ArbreBinaire<String> a5 = new ArbreBinaire<>("5");
        ArbreBinaire<String> a6 = new ArbreBinaire<>("6");

        a1.setGauche(a2);
        a1.setDroite(a3);
        a3.setGauche(a4);
        a3.setDroite(a5);
        a4.setGauche(a6);

        a6.show();

        IterateurConcret iterateurConcret = new IterateurConcret();
        while (iterateurConcret.hasNext()) {
            System.out.println(iterateurConcret.next());
        }
    }

}


/*

           a1
           /\
         a2  a3
             /\
           a4  a5
           /
         a6
*/