package GraphicaObjectsModule.Style;

public class Fill {

    private RGB fillColor;
    private Double opacity;

    public Fill(RGB fillColor, Double opacity) {
        this.fillColor = fillColor;
        this.opacity = opacity;
    }

    public Fill() {
        this.fillColor = new RGB();
        this.opacity = 1.0;
    }

    public RGB getFillColor() {
        return fillColor;
    }

    public void setFillColor(RGB fillColor) {
        this.fillColor = fillColor;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }
}
