package game_elements;

import org.opencv.core.MatOfPoint;

public class Slice {
    public final ColorWheelColor color;
    public final MatOfPoint contour;

    public Slice(MatOfPoint contour, ColorWheelColor color) {
        this.contour = contour;
        this.color = color;
    }

}