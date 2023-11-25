package GraphicaObjectsModule.Shapes;

import java.util.List;

public class Polygon extends Shape{

    private List<Coordinate> coordinates;

    public Polygon() {
    }

    public Polygon(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
