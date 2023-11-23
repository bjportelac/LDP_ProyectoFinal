package GraphicaObjectsModule.Style;

public class IStyle {

    private Fill fill;
    private Stroke stroke;
    private Double figureOpacity;

    public IStyle(Fill fill, Stroke stroke, Double figureOpacity) {
        this.fill = fill;
        this.stroke = stroke;
        this.figureOpacity = figureOpacity;
    }

    public IStyle() {
        this.fill = new Fill();
        this.stroke = new Stroke();
        this.figureOpacity = 1.0;
    }

    public Fill getFill() {
        return fill;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public Double getFigureOpacity() {
        return figureOpacity;
    }

    public void setFigureOpacity(Double figureOpacity) {
        this.figureOpacity = figureOpacity;
    }
}
