package borrar;
import java.util.List;


public class Llibre {

    private String titol;

    private final String isbn;

    private List<Ressenya> ressenyes;


    public Llibre(String titol, String isbn) {
        this.titol = titol;
        this.isbn = isbn;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Ressenya> getRessenyes() {
        return ressenyes;
    }

    public void addRessenya(Ressenya ressenya) {
        ressenyes.add(ressenya);
    }

    public double getMitjanaPuntuacions() {
        double sum = 0;
        for (Ressenya ressenya : ressenyes) {
            sum += ressenya.getPuntuacio();
        }
        return sum / ressenyes.size();
    }
}
