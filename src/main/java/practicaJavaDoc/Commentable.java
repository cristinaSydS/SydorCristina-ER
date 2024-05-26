package practicaJavaDoc;

import java.util.List;

/**
 * representa un comentable
 */
public interface Commentable {

    /**
     * añade un comentario al objeto con un objeto comenatiro
     * @param comment
     */
    void addComment(Comment comment);

    /**
     * obtiene comentarios al post
     * @return lista de comentarios
     */
    List<Comment> getComments();
}
