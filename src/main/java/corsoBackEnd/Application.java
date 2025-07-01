package corsoBackEnd;

import com.github.javafaker.Faker;
import corsoBackEnd.entities.festaDelPaese;
import corsoBackEnd.entities.tipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Application {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("U4-W3-D2-B");

        EntityManager em= emf.createEntityManager();

        Faker faker = new Faker();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(new festaDelPaese("Sagra della polenta","Venite tutti alla festa", tipoEvento.PUBLICO,200));

        transaction.commit();

        em.close();
        emf.close();
    }



}
