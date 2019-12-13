package Visitor.Emprunts;

import java.time.LocalDate;

public class CalculDate {

    public static LocalDate ajouter(int jours) {
        return LocalDate.now().plusDays(jours);
    }
}
