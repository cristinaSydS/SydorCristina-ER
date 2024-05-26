package ud6.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una publicacion
 * @author crist
 * @version 1.0, 27/43/4443
 * see Commentable
 */
public class Post implements Commentable {
    /**
     * titulo de la publicacion
     */
    private final String title;
    /**
     * contenido de la publicacion
     */
    private final String content;
    /**
     * lista de comentario de la publicacion
     */
    private final List<Comment> comments;

    /**
     * Crea un apublicacion mediante un titulo y un contenido especificados y una lista de comentarios
     * @param title titulo de l apublicacion
     * @param content contenido de l apublicacion
     */
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    /**
     * obtiene el tirulo de una pulicacion
     * @return titulo de la publicacion
     */
    public String getTitle() {
        return title;
    }

    /**
     * obtiene el contendiio de la publicacio
     * @return contendio ode la publicacion
     */
    public String getContent() {
        return content;
    }

    /**
     * obtien ela lista de comentarios de una publicacion
     * @return lista de comentarios
     */
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * añade un comenatrio a la lista de comentarios de la publicacion
     * @param comment comentario para añadir
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
