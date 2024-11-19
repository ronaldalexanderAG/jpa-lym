package pe.edu.cibertec.entity;

import jakarta.persistence.*;

import javax.xml.namespace.QName;
import java.util.Date;
@Entity
@Table (name="libros")
public class Libro {

    @Id
    private String isbn;
    private String titulo;
    private String autor;
    private Date fecha;
    private double precio;
    @ManyToOne
    @JoinColumn(name ="codigo_categoria")
    private Categoria categoria;

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }

    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, Date fecha, double precio, Categoria categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
