package practicaJavaDoc;


import java.util.ArrayList;
import java.util.List;

/**
 * representa un post
 * @version 1.0, 2024-05-14
 * @author crist syd
 * @see Commentable
 */
public class Post implements Commentable {
    /**
     * titulo del post
     */
    private final String title;
    /**
     * contenido del post
     */
    private final String content;
    /**
     * lista de comentario del post
     */
    private final List<Comment> comments;

    /**
     * crea un post con un titulo y contenidos especificados
     * @param title titulo del post
     * @param content contenido del post
     */
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
    }


    /**
     * obtiene el titulo del post
     * @return titulo del post
     */
    public String getTitle() {
        return title;
    }

    /**
     * obtiene el contenido del post
     * @return contenido del post
     */
    public String getContent() {
        return content;
    }

    /**
     * obtiene lista de comentario del post
     * @return lista de comentarios al post
     */
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * añade un comentario a la lsita de comentarios del post
     * @param comment comentario a añadir a la lista
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
