
// TPJpa 4
package fr.diginamic.entite;


import fr.diginamic.entities.Emprunt;
import jakarta.persistence.*;

@Entity
public class Compo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_livre")
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "id_emprunt")
    private fr.diginamic.entities.Emprunt emprunt;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public fr.diginamic.entities.Emprunt getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Emprunt emprunt) {
        this.emprunt = emprunt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compo{");
        sb.append("id=").append(id);
        sb.append(", livre=").append(livre);
        sb.append(", emprunt=").append(emprunt);
        sb.append('}');
        return sb.toString();
    }
}
