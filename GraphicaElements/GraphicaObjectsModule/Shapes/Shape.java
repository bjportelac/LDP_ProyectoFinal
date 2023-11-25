package GraphicaObjectsModule.Shapes;

import GraphicaObjectsModule.Style.IStyle;

public class Shape {

    private IStyle style;

    public Shape(IStyle style) {
        this.style = style;
    }

    public Shape() {
    }

    public IStyle getStyle() {
        return style;
    }

    public void setStyle(IStyle style) {
        this.style = style;
    }
}
