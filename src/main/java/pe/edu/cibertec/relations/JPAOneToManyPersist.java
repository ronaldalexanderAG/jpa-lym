package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAOneToManyPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();
        //creando nueva cat1
        Categoria cat1 = new Categoria("C100", "NuevaCat",null  );
        //crear libros a traves de categoria
        Libro libro1 = new Libro("l1010","Generico","desconocido", new Date(),40.5,cat1);
        Libro libro2 = new Libro("l1011","Generico","desconocido", new Date(),440.5,cat1);
        Libro libro3 = new Libro("l1012","Generico","desconocido", new Date(),80.5,cat1);

        //agregar libros a la categoria
        cat1.setLibros(Arrays.asList(libro1,libro2,libro3));
        //Persistencia
        em.getTransaction().begin();
        em.persist(cat1);
        em.getTransaction().commit();
    }
}
