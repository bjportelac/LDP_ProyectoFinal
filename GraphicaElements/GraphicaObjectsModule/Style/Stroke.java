package GraphicaObjectsModule.Style;

public class Stroke {

    private RGB strokeColor;
    private Double strokeOpacity;
    private Double strokeWidth;
    private String linecap;

    public Stroke(RGB strokeColor, Double strokeOpacity, Double strokeWidth, String linecap) {
        this.strokeColor = strokeColor;
        this.strokeOpacity = strokeOpacity;
        this.strokeWidth = strokeWidth;
        this.linecap = linecap;
    }

    public Stroke() {
        this.strokeColor = new RGB();
        this.strokeOpacity = 1.0;
        this.strokeWidth = 1.0;
        this.linecap = "butt";
    }

    public RGB getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(RGB strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Double getStrokeOpacity() {
        return strokeOpacity;
    }

    public void setStrokeOpacity(Double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public String getLinecap() {
        return linecap;
    }

    public void setLinecap(String linecap) {
        this.linecap = linecap;
    }
}
