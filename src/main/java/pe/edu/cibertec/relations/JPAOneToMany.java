package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;

public class JPAOneToMany {
    public static void main(String[] args) {
        //referenciamos al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();

        Categoria cat1 = em.find(Categoria.class, "C1");
        cat1.getLibros().forEach(System.out::println);
    }
}
