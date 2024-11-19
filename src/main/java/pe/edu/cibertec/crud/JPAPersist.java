package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {
        //referenciamos al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();
        // crear un libro
        Libro libro = new Libro("L001","Algo","ALgo2", new Date(),50.5,null );
        //aqui el persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }


}
