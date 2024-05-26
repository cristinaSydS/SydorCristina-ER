package practicaJavaDoc;

import java.util.List;
import java.util.ArrayList;

/**
 * representa un comentario
 * @author crist syd
 * @version 1.0, 2024-05-14
 */
public class Comment implements Commentable {
    /**
     * contenido del comentario
     */
    private final String content;
    /**
     * lista de comentarios
     */
    private final List<Comment> comments;

    /**
     * crea un comentario nuevo a partir del tecto y lo añade en una lista
     * @param content contenido del comentario
     */
    public Comment(String content) {
        this.content = content;
        this.comments = new ArrayList<>();
    }

    /**
     * devuelve el contenido del comentario
     * @return contenido del comentario
     */
    public String getContent() {
        return content;
    }

    /**
     * agrega un comentario a una lista de comentarios
     * @param comment comentario para agregar a la lsita
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    /**
     * devuelve comentario de una lista
     * @return comentario de la lista
     */
    public List<Comment> getComments() {
        return comments;
    }
}
