package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();

        Libro libro = em.find(Libro.class, "L001");

        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }
}
