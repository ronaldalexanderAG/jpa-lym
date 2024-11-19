package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

public class JPAOneToManeOrphan {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();
        //obtener categoria
        Categoria cat1 = em.find(Categoria.class,"C1");
        //obtener libro
        Libro libro = em.find(Libro.class, "A9");

        //desasociar categoria
        cat1.getLibros().remove(libro);
        //merge
        em.getTransaction().begin();
        em.merge(cat1);
        em.getTransaction().commit();

    }
}
