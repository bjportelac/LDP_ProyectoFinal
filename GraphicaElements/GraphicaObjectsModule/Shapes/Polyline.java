package GraphicaObjectsModule.Shapes;

import java.util.List;

public class Polyline extends Shape{

    private List<Coordinate> coordinates;

    public Polyline() {
    }

    public Polyline(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
