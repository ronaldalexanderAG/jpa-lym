package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;

public class JPAOneToManyRemove {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();

        Categoria cat1 = em.find(Categoria.class,"C100");

        em.getTransaction().begin();
        em.remove(cat1);
        em.getTransaction().commit();
    }
}
