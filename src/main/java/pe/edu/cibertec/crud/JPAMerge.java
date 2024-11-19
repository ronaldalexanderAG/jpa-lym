package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAMerge {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();
        //obtener algun libro
        Libro libro= em.find(Libro.class, "l0001");
        libro.setAutor("Grabriel Garcia");

        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();

    }
}
