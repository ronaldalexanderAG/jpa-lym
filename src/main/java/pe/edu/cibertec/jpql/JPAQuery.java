package pe.edu.cibertec.jpql;

import jakarta.persistence.*;
import pe.edu.cibertec.entity.Libro;

import java.math.BigDecimal;
import java.util.List;

public class JPAQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nueva");
        EntityManager em = emf.createEntityManager();

        /**
         * Select clasico
         */
     //   TypedQuery<Libro> query = em.createQuery("select l1 from Libro l1", Libro.class);
        /**
         * Select con where clasico y where con variable
         */
     //   TypedQuery<Libro> querywhere =em.createQuery("select l2 from Libro l2 where l2.autor = 'Claudia'" , Libro.class);
        /**
         * Select where con variable
         */
      //  TypedQuery<Libro> querywherePara = em.createQuery("Select l3 from Libro l3 where l3.autor=:Parametro", Libro.class);
      //  querywherePara.setParameter("Parametro", "Cesar");

        /**
         * Select where con between
         */
      //   TypedQuery<Libro> querywhereBetWeen= em.createQuery("select l4 from Libro l4 where l4.precio between :inicio and :fin" ,Libro.class);
      //  querywhereBetWeen.setParameter("inicio", 30);
      //  querywhereBetWeen.setParameter("fin", 50);
        /**
         * Select where con "In" --> para un grupo
         */
     //   TypedQuery<Libro> query= em.createQuery("select l4 from Libro l4 where l4.autor in ('Claudia','Cesar')" ,Libro.class);

        /**
         * Select valores escalres -- con distinct (que no se repitan) -- UPPER(convertir en mayuscula)
         */
       // TypedQuery<String> query= em.createQuery("select l4.autor from Libro l4 where l4.autor in ('Claudia','Cesar')" ,String.class);

      // TypedQuery<String> query= em.createQuery("select distinct UPPER(l4.autor) from Libro l4 where l4.autor in ('Claudia','Cesar')" ,String.class);

        /**
         * select order by (ordenar por grupos) -- con desc (orden descendente ,tambien puede ser ascendente)
         */
        //TypedQuery<Libro> query= em.createQuery("select l4 from Libro l4 order by l4.precio desc " ,Libro.class);

        /**
         * Select group by (agrupar autor con contador o quizas sumar,etc)
         */
        //TypedQuery<Object[]> query= em.createQuery("select l4.autor, count (l4)from Libro l4 group by  l4.autor", Object[].class);
        // se espera que retorne un tipo objeto por que en la consulta jpql va a devolver un autor y un contador son dos tipos de datos distintos
        //hay que imprimir los indices necesarios a mostrar en este caso 0 para el autor 1 para contador los cuales
        //estaran dentro de la variable elemento que contiene los objetos de la consulta del query

      // query.getResultList().forEach(elemento -> {
      //      System.out.println(elemento[0] + " -> " + elemento[1]);});
        /**
         * Selec - is null
         */
       // TypedQuery<Libro> query= em.createQuery("select l4 from Libro l4 where l4.autor is null " ,Libro.class);
        /**
         * select - like
         */
        TypedQuery<Libro> query= em.createQuery("select l4 from Libro l4 where l4.titulo like 'c%' " ,Libro.class);
        //Aqui imprimo resultados
       query.getResultList().forEach(System.out::println);
    }
}
