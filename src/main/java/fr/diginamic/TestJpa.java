// TPJpa 4

package fr.diginamic;

import fr.diginamic.entite.Banque;
import fr.diginamic.entite.Client;
import fr.diginamic.entite.Compte;
import fr.diginamic.entite.Operation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDateTime;

public class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Création des objets
            Banque banque = new Banque();
            banque.setNom("Banque Centrale");

            Client client = new Client();
            client.setNom("Aima");
            client.setPrenom("Jacket");
            client.setAdresse(new Client.Adresse( "50, rue cyprien tourel", "Montpellier","34070"));

            Compte compte = new Compte();
            compte.setNumeroCompte("123456789");
            compte.setSolde(1000);
            compte.setClient(client);

            Operation operation = new Operation();
            operation.setDateOperation(LocalDateTime.now());
            operation.setMontant(150);
            operation.setCompte(compte);

            // Persistance des objets
            em.persist(banque);
            em.persist(client);
            em.persist(compte);
            em.persist(operation);

            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
