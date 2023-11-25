package GraphicaObjectsModule.Shapes;

public class Circle extends Shape{

    private Integer cx;
    private Integer cy;
    private Integer r;


    public Circle(Integer cx, Integer cy, Integer r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;

    }

    public Circle() {
        this.cx = 0;
        this.cy = 0;
        this.r = 1;
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

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }
}
