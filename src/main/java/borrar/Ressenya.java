package borrar;
/**
 * Representa una reseña de un libro
 * @author Cristina Sydor
 * @version 1.0, 27/05/2024
 */
public class Ressenya {
    /**
     * Texto de una reseña de un libro
     */
    private String text;
    /**
     * Puntuacion en la reseña
     */
    private int puntuacio;

    /**
     * Crea una reseña especificando un texto y una puntuación
     * @param text texto de una reseña
     * @param puntuacio puntuación de la reseña
     */
    public Ressenya(String text, int puntuacio) {
        this.text = text;
        this.puntuacio = puntuacio;
    }

    /**
     * Obtiene el texto de una reseña
     * @return Texto de una reseña
     */
    public String getText() {
        return text;
    }

    /**
     * Obtiene la puntuación de la reseña
     * @return puntuación de la reseña
     */
    public int getPuntuacio() {
        return puntuacio;
    }
}
