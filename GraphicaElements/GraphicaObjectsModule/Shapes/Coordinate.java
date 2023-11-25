package GraphicaObjectsModule.Shapes;

public class Coordinate {
    final static String TAG = "Coordinates";

    private Integer x;
    private Integer y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }
    public Coordinate(Integer value) {
        this.x = value;
        this.y = value;
    }

    public Coordinate(Integer x, Integer y) {
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
