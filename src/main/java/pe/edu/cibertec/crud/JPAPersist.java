package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.identity.Libro;

import java.util.Date;

public class JPAPersist {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        Libro lib = new Libro("A11", "El escultor de cadaveres","Cesar Garcia", new Date(), 15.5,null);

        em.getTransaction().begin();
        em.persist(lib);
        em.getTransaction().commit();

    }
}
