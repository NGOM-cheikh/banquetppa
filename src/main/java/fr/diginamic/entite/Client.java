
// TPJpa 4
package fr.diginamic.entite;


import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;

    @Embedded
    private Adresse adresse;

    public void setNom(String dupont) {
    }

    public void setPrenom(String jacket) {
    }

    public void setAdresse(Adresse montpellier) {
    }

    // Getters and Setters

    @Embeddable
    public static class Adresse {
        private String rue;
        private String ville;
        private String codePostal;

        public Adresse(String s, String montpellier, String number) {

        }


        // Getters and Setters

        public String getRue() {
            return rue;
        }

        public void setRue(String rue) {
            this.rue = rue;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public String getCodePostal() {
            return codePostal;
        }

        public void setCodePostal(String codePostal) {
            this.codePostal = codePostal;
        }
    }
}
