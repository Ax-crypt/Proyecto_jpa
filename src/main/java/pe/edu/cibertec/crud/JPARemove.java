package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.identity.Libro;

public class JPARemove {
    public static void main(String[] args) {
        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // obtener libro
        Libro libro = em.find(Libro.class, "A100");

        // remove
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();

    }
}
