package borrar;

public class Ressenya {

    private String text;

    private int puntuacio;


    public Ressenya(String text, int puntuacio) {
        this.text = text;
        this.puntuacio = puntuacio;
    }


    public String getText() {
        return text;
    }

    
    public int getPuntuacio() {
        return puntuacio;
    }
}
