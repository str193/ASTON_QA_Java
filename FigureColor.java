package Lesson_3;

public class FigureColor {
    private String fillColor;
    private String borderColor;

    public FigureColor(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }


}