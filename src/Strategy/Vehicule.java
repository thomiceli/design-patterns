package Strategy;

import java.time.LocalDate;

public class Vehicule {
    private String nrPlaque;
    private LocalDate dateArrivee;

    public Vehicule(LocalDate ha, String nr) {
        dateArrivee = ha;
        nrPlaque = nr;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "nrPlaque=’" + nrPlaque + "’" + ", dateArrivée=" + dateArrivee + '}';
    }
}
