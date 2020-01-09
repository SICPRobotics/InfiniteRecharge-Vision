import java.util.ArrayList;

import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgproc.Moments;

import game_elements.ColorWheel;
import game_elements.ColorWheelColor;
import game_elements.Slice;

public class ElementManager {
    static final float alignmentPointX = 50;
    static final float alignmentPointY = 50;

    static ColorWheel colorWheelFromContours(ArrayList<MatOfPoint> blue, ArrayList<MatOfPoint> yellow, ArrayList<MatOfPoint> red, ArrayList<MatOfPoint> green) {
        ArrayList<Slice> slices = new ArrayList<Slice>();

        for (MatOfPoint slice : blue) {
            slices.add(new Slice(slice, ColorWheelColor.BLUE));
        }
        for (MatOfPoint slice : yellow) {
            slices.add(new Slice(slice, ColorWheelColor.YELLOW));
        }
        for (MatOfPoint slice : red) {
            slices.add(new Slice(slice, ColorWheelColor.RED));
        }
        for (MatOfPoint slice : green) {
            slices.add(new Slice(slice, ColorWheelColor.GREEN));
        }

        //System.out.println("Making color wheel!");
        //System.out.println(slices);

        double smallestDist = 10000;
        Slice closestSlice = null;
        for (Slice slice : slices) {
            double dist = Imgproc.pointPolygonTest(new MatOfPoint2f(slice.contour.toArray()), new Point(alignmentPointX, alignmentPointY), true);
            if (smallestDist > dist) {
                smallestDist = dist;
                closestSlice = slice;
            }
        }
        return new ColorWheel(closestSlice);
    }

    static Mat drawColorWheelOn(Mat mat, ColorWheel colorWheel) {
        //Draw alignment point
        Imgproc.circle(mat, new Point(ElementManager.alignmentPointX, ElementManager.alignmentPointY), 5, new Scalar(0.0,0.0,255.0));

        if (colorWheel.currentSlice != null) {
            Moments moments = Imgproc.moments(colorWheel.currentSlice.contour);
            Point center = new Point(moments.m10 / moments.m00, moments.m01 / moments.m00);
            Imgproc.circle(mat, center, 5, new Scalar(255.0, 0, 0));
        } 
        

        return mat;
    }
}