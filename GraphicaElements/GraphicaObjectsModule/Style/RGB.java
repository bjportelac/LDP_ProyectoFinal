package GraphicaObjectsModule.Style;

public class RGB {

    private Integer red;
    private Integer green;
    private Integer blue;

    public RGB(Integer red, Integer green, Integer blue) {
        this.red = channelRanger(red);
        this.green = channelRanger(green);
        this.blue = channelRanger(blue);
    }

    public RGB() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    private Integer channelRanger(Integer value) {
        if (value == null) {
            return 0;
        }
        return Math.min(255, Math.max(0, value));
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

}
