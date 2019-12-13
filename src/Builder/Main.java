package Builder;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Employe e = new Employe.Builder("Durand", "Jacques")
                .addNrINSEE("189599991234")
                .addDateNaissance(LocalDate.of(1997, Month.SEPTEMBER, 01))
                .addNumeroID(1214)
                .addEchelon(3)
                .build();

        System.out.println(e.toString());

    }
}
