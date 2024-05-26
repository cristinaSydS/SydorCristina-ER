package ud6.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprsenta un usuario
 * @author crist
 * @version 1.0, 26/05/2024
 */
public class User {

    /**
     * Nombre del usuario
     */
    private final String username;
    /**
     * Lista de publicaciones
     */
    private final List<Post> posts;


    /**
     * Crea una lista de publicaciones para un nombre de usuario especificado
     * @param username nombre del usuario
     */
    public User(String username) {
        this.username = username;
        this.posts = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del usuario
     * @return nombre del usuaurio
     */
    public String getUsername() {
        return username;
    }

    /**
     * Obtiene una lista de las publicaciones
     * @return publicaciones
     */
    public List<Post> getPosts() {
        return posts;
    }


    /**
     * Añade una publciacion especificada a la lista
     * @param post publicacion para añadir
     */
    public void addPost(Post post) {
        posts.add(post);
    }
}
