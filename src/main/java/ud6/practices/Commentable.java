package ud6.practices;

import java.util.List;

/**
 * Representa un objeto comentario
 * @author crist
 * @version 1.0, 26/05/2024
 *
 */
public interface Commentable {

    /**
     * Añade un comentario especificado
     * @param comment comentario para añadir
     */
    void addComment(Comment comment);

    /**
     * Obtiene una lista de los comentarios
     * @return lista de comentarios
     */
    List<Comment> getComments();
}
