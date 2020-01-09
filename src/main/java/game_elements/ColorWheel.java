package game_elements;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorWheel {
    public static ArrayList<ColorWheelColor> order = new ArrayList<ColorWheelColor>(Arrays.asList(new ColorWheelColor[]{
        ColorWheelColor.BLUE,
        ColorWheelColor.YELLOW,
        ColorWheelColor.RED,
        ColorWheelColor.GREEN
    }));
    public final Slice currentSlice;

    public ColorWheel(Slice currentSlice) {
        this.currentSlice = currentSlice;

        if (this.currentSlice != null) {
            System.out.println("Current slice color: " + currentSlice.color);
        }
    }

    private int distanceToWithoutWrapping(ColorWheelColor color) {
        return ColorWheel.order.indexOf(color) - ColorWheel.order.indexOf(this.currentSlice.color);
    }

    private int distanceWrappedTo(ColorWheelColor color) {
        return ColorWheel.order.indexOf(color) - (ColorWheel.order.indexOf(this.currentSlice.color) - ColorWheel.order.size());
    }

    public int distanceTo(ColorWheelColor color) {
        return Math.abs(distanceToWithoutWrapping(color)) < Math.abs(distanceWrappedTo(color)) ? distanceToWithoutWrapping(color) : distanceWrappedTo(color);
    }
}