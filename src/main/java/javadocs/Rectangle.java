package javadocs;

/**
 *
 */
public class Rectangle {
    private int width;
    private int height;
    private int x;
    private int y;

    /**
     *
     * @param width
     * @param height
     * @param x
     * @param y
     */
    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
    }

    /**
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int area(){
        // AREA = BASE * ALTURA
        return this.width * this.height;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean contains(int x, int y){
        boolean insideX = (x >= this.x) && (x <= (this.x + width));
        boolean insideY = (y >= this.y) && (y <= (this.y + height));
        return insideX && insideY;
    }
}
