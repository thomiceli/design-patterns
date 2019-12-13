package Builder;

import java.time.LocalDate;

public class Employe {
    private int numeroId;
    private String nrINSEE, nom, prenom;
    private int echelon;
    private LocalDate dateNaissance;
    private double base, nbHeures;

    private Employe(Builder builder) {
        numeroId = builder.numeroId;
        nrINSEE = builder.nrINSEE;
        nom = builder.nom;
        prenom = builder.prenom;
        dateNaissance = builder.dateNaissance;
        echelon = builder.echelon;
        base = builder.base;
        nbHeures = builder.nbHeures;
    }

    public String toString() {
        return "Employé " + this.numeroId + " " + this.prenom + " " + this.nom + " " + this.dateNaissance + "\n" +
                "Insee : " + this.nrINSEE + " \n" +
                "Base : " + this.base + " | Nbheures : " + this.nbHeures + "h";
    }

    public static class Builder {
        private int numeroId, echelon;
        private String nrINSEE, nom, prenom;
        private LocalDate dateNaissance;
        private double base, nbHeures;

        public Builder(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public Builder addNumeroID(int n) {
            this.numeroId = n;
            return this;
        }

        public Builder addEchelon(int e) {
            this.echelon = e;
            return this;
        }

        public Builder addNrINSEE(String n) {
            this.nrINSEE = n;
            return this;
        }

        public Builder addDateNaissance(LocalDate d) {
            this.dateNaissance = d;
            return this;
        }

        public Employe build() {
            return new Employe(this);
        }
    }
}
