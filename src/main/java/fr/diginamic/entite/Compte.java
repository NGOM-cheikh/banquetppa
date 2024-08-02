

package fr.diginamic.entite;


import jakarta.persistence.*;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCompte;
    private double solde;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compte{");
        sb.append("id=").append(id);
        sb.append(", numeroCompte='").append(numeroCompte).append('\'');
        sb.append(", solde=").append(solde);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }
}


