package practicaJavaDoc;


import java.util.ArrayList;
import java.util.List;

/**
 * una clase para crear aun usuario
 * @author crist
 * @version 1
 */
public class User {
    /**
     * nombre del surarui
     */
    private final String username;

    /**
     * lista de posts
     */
    private final List<Post> posts;

    /**
     * construye un uruario mediante un nombre
     * @param username nombre del usuario
     */
    public User(String username) {
        this.username = username;
        this.posts = new ArrayList<>();
    }

    /**
     * Metodo para obtener el nombre del usuario
     * @return nombre del usuariio
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo para obtener la lista de posts
     * @return lista de posts hechos por le usuario
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * Metodo para agregar un nuevo post
     * @param post el post a ser agregado
     */
    public void addPost(Post post) {
        posts.add(post);
    }
}

