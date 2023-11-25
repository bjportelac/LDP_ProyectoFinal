package GraphicaObjectsModule.Shapes;

public class Ellipse extends Shape{

    private Integer cx;
    private Integer cy;
    private Integer rx;
    private Integer ry;

    public Ellipse() {
    }

    public Ellipse(Integer cx, Integer cy, Integer rx, Integer ry) {
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
    }

    public Integer getCx() {
        return cx;
    }

    public void setCx(Integer cx) {
        this.cx = cx;
    }

    public Integer getCy() {
        return cy;
    }

    public void setCy(Integer cy) {
        this.cy = cy;
    }

    public Integer getRx() {
        return rx;
    }

    public void setRx(Integer rx) {
        this.rx = rx;
    }

    public Integer getRy() {
        return ry;
    }

    public void setRy(Integer ry) {
        this.ry = ry;
    }
}
