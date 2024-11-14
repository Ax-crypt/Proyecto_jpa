package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.identity.Libro;

public class JPAMerge {
public static void main(String[] args) {
    // referenciar al EMF y EM
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
    EntityManager em = emf.createEntityManager();

    // obtener libro
    Libro libro = em.find(Libro.class, "A10");
    libro.setTitulo("Cien años de soledad");
    libro.setAutor("Gabriel García Marquez");

    // merge
    em.getTransaction().begin();
    em.merge(libro);
    em.getTransaction().commit();
}
}
