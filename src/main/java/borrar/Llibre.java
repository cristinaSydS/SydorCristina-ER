package borrar;
import java.util.List;

/**
 * Representa un libro
 * @author Cristina Sydor
 * @version 1.0, 27/05/2024
 */
public class Llibre {
    /**
     * Título del libro
     */
    private String titol;
    /**
     * isbn del libro
     */
    private final String isbn;
    /**
     * Lista de reseñas del libro
     */
    private List<Ressenya> ressenyes;

    /**
     * Crea un libro usando un título y un isbn especificado
     * @param titol título del libro
     * @param isbn isbn del libro
     */
    public Llibre(String titol, String isbn) {
        this.titol = titol;
        this.isbn = isbn;
    }
    /**
     * Obtiene el título del libro
     * @return título del libro
     */
    public String getTitol() {
        return titol;
    }
    /**
     * Le pone un título especificado al libro
     * @param titol título para poner
     */
    public void setTitol(String titol) {
        this.titol = titol;
    }
    /**
     * Obtiene el isbn del libro
     * @return isbn del libro
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * Obtiene la lista de reseñas del libro
     * @return reseñas del libro
     */
    public List<Ressenya> getRessenyes() {
        return ressenyes;
    }
    /**
     * Añade una reseña especificada a la lista de reseñas
     * @param ressenya
     */
    public void addRessenya(Ressenya ressenya) {
        ressenyes.add(ressenya);
    }
    /**
     * Obtiene la media de las puntuaciones que tiene el libro
     * @return media de puntuaciones del libro
     * @see Ressenya
     */
    public double getMitjanaPuntuacions() {
        double sum = 0;
        for (Ressenya ressenya : ressenyes) {
            sum += ressenya.getPuntuacio();
        }
        return sum / ressenyes.size();
    }
}
