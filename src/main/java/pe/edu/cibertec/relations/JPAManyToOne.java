package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.identity.Libro;

public class JPAManyToOne {
    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // obtener libro
        Libro libro = em.find(Libro.class, "A2");

        // print categoria
        System.out.println(libro.getCategoria());

    }
}
