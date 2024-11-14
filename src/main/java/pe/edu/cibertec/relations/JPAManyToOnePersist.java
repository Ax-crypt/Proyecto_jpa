package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.identity.Categoria;
import pe.edu.cibertec.identity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAManyToOnePersist {
    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // crear categoria
        Categoria categoria = new Categoria("C10", "Misterio", null);

        // crear libro
        Libro libro = new Libro("A15", "La noche que el diablo visito Monclova", "Cesar Garcia", new Date(), 30.45, categoria);

        // agregar el libro a la categoria
        categoria.setLibros(Arrays.asList(libro));

        // persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    }
}
