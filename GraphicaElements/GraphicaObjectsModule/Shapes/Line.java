package GraphicaObjectsModule.Shapes;

public class Line extends Shape{
    private Coordinate c1;
    private Coordinate c2;

    public Line() {
    }

    public Line(Integer x1,Integer y1,Integer x2,Integer y2) {
        this.c1 = new Coordinate(x1,y1);
        this.c2 = new Coordinate(x2,y2);
    }

    public Line(Coordinate c1, Coordinate c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Coordinate getC1() {
        return c1;
    }

    public void setC1(Coordinate c1) {
        this.c1 = c1;
    }

    public Coordinate getC2() {
        return c2;
    }

    public void setC2(Coordinate c2) {
        this.c2 = c2;
    }
}
