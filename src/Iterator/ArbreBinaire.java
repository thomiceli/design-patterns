package Iterator;

import java.util.Iterator;

public class ArbreBinaire<T> implements Iterable {

    private ArbreBinaire<T> pere;
    private ArbreBinaire<T> gauche;
    private ArbreBinaire<T> droite;

    private T val;

    ArbreBinaire(T t) {
        this.val = t;
        this.pere = null;
        this.gauche = null;
        this.droite = null;
    }

    public ArbreBinaire<T> getPere() {
        return pere;
    }

    public void setPere(ArbreBinaire<T> pere) {
        this.pere = pere;
    }

    public ArbreBinaire<T> getGauche() {
        return this.gauche;
    }

    public void setGauche(ArbreBinaire<T> gauche) {
        this.gauche = gauche;

        gauche.pere = this;
    }

    public ArbreBinaire<T> getDroite() {
        return this.droite;
    }

    public void setDroite(ArbreBinaire<T> droite) {
        this.droite = droite;

        droite.pere = this;

    }

    public void show() {
        if (this.pere != null) {
            this.pere.show();
        }
        System.out.print(val + " ");
    }

    public T getVal() {
        return val;
    }

    private ArbreBinaire<T> fg(ArbreBinaire<T> n) {
        while (n.gauche != null) {
            n = n.gauche;
        }
        return n;
    }


    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private ArbreBinaire<T> nC = ArbreBinaire.this.fg(ArbreBinaire.this);

            @Override
            public T next() {
                T res = nC.getVal();
                if (nC.droite != null)
                    nC = fg(nC.droite);
                else {
                    ArbreBinaire<T> pere = nC.pere;
                    while (pere != null && pere.droite == nC) {
                        nC = pere;
                        pere = nC.pere;
                    }
                    nC = pere;
                }
                System.out.println(res);
                return res;
            }

            @Override
            public boolean hasNext() {
                return nC != null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }


}
