package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAFind {
    public static void main(String[] args) {
        //referenciamos al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();

        //consultando libro a traves de .find
        Libro libro = em.find(Libro.class, "L0001" );
        System.out.println(libro);
    }
}
