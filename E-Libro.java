/**
 * La clase Libro representa un libro en una biblioteca.
 * Ejemplo para explicar el concepto de encapsulamiento en POO.
 */
package clases;

public class Libro {
    // Atributos privados: solo accesibles dentro de esta clase.
    private String titulo;
    private String autor;
    private String isbn;
    // ATRIBUTO PÚBLICO (NO encapsulado → se puede modificar desde fuera)
    public int anioPublicacion;
    // ATRIBUTO PRIVADO con validación en setter
    private double precio;    
    
    // Atributo estático compartido por todos los objetos de tipo Libro
    private static int contadorlibros = 0;

    public Libro() {
        this.titulo = null;
        this.autor = null;
        this.isbn = null;
        this.anioPublicacion = 0;
        this.precio = 0;
        contadorlibros++;
    }
        
    public Libro(String titulo, String autor, String isbn, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        contadorlibros++;
    }

    // ----- MÉTODOS GET Y SET (ENCAPSULAMIENTO) -----
    // Getter: devuelve el valor del atributo privado "titulo"
   public String getTitulo() {
        return titulo;
    }
    // Setter: permite modificar el valor del atributo "titulo"
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Error el precio nop puede ser negativo");
            } else {
                this.precio = precio;
            }            
    }
    // ----- MÉTODOS DE LA CLASE -----
    /**
     * Devuelve la información del libro en formato legible.
     */
    public String obtenerInformacion() {
        return String.format("«%s», %s (ISBN: %s, Año: %d, Precio: %.2f)",
                titulo, autor, isbn, anioPublicacion, precio);
    }

    public static int obtenerContadorLibros() {
        return contadorlibros;
    }    
}
