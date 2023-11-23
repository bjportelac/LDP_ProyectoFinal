package GraphicaObjectsModule;

public class GraphicaCoordinates {
    final static String TAG = "Coordinates";

    private Integer x;
    private Integer y;

    public GraphicaCoordinates() {
        this.x = 0;
        this.y = 0;
    }
    public GraphicaCoordinates(Integer value) {
        this.x = value;
        this.y = value;
    }

    public GraphicaCoordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
