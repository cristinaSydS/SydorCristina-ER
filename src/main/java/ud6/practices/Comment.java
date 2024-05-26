package ud6.practices;

import java.util.List;
import java.util.ArrayList;


/**
 * representa un comentario
 * @author crist
 * @version 1.0, 26/05/2024
 * see Commentable
 */
public class Comment implements Commentable {

    /**
     * Contendio del comentario
     */
    private final String content;

    /**
     * lista de comentarios
     */
    private final List<Comment> comments;

    /**
     * Crea una lista de comentarios con un contenido de comentario especificado
     * @param content contenido del comentario
     */
    public Comment(String content) {
        this.content = content;
        this.comments = new ArrayList<>();
    }

    /**
     * Obtiene el contenido de un comentario
     * @return contenido del comentario
     */
    public String getContent() {
        return content;
    }

    /**
     * añade un comentario especificado a la lista
     * @param comment comentario para añadir
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    /**
     * obtiene la lista de comentarios
     * @return lista de comentarios
     */
    public List<Comment> getComments() {
        return comments;
    }
}
