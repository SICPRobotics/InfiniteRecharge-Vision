import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

import edu.wpi.first.vision.VisionPipeline;

import org.opencv.core.*;
import org.opencv.core.Core.*;
import org.opencv.features2d.FeatureDetector;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.*;
import org.opencv.objdetect.*;

/**
* ColorWheelPipeline class.
*
* <p>An OpenCV pipeline generated by GRIP.
*
* @author GRIP
*/
public class ColorWheelPipeline implements VisionPipeline {

	//Outputs
	private Mat blurOutput = new Mat();
	private Mat hslThreshold0Output = new Mat();
	private ArrayList<MatOfPoint> findContours0Output = new ArrayList<MatOfPoint>();
	private ArrayList<MatOfPoint> filterContours0Output = new ArrayList<MatOfPoint>();
	private Mat hslThreshold1Output = new Mat();
	private ArrayList<MatOfPoint> findContours1Output = new ArrayList<MatOfPoint>();
	private ArrayList<MatOfPoint> filterContours1Output = new ArrayList<MatOfPoint>();
	private Mat hslThreshold2Output = new Mat();
	private ArrayList<MatOfPoint> findContours2Output = new ArrayList<MatOfPoint>();
	private ArrayList<MatOfPoint> filterContours2Output = new ArrayList<MatOfPoint>();
	private Mat hslThreshold3Output = new Mat();
	private ArrayList<MatOfPoint> findContours3Output = new ArrayList<MatOfPoint>();
	private ArrayList<MatOfPoint> filterContours3Output = new ArrayList<MatOfPoint>();

	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public ArrayList<MatOfPoint> getBlueContours() {
		return this.filterContours0Output;
	}

	public ArrayList<MatOfPoint> getYellowContours() {
		return this.filterContours1Output;
	}

	public ArrayList<MatOfPoint> getRedContours() {
		return this.filterContours2Output;
	}

	public ArrayList<MatOfPoint> getGreenContours() {
		return this.filterContours3Output;
	}

	/**
	 * This is the primary method that runs the entire pipeline and updates the outputs.
	 */
	@Override	public void process(Mat source0) {
		// Step Blur0:
		Mat blurInput = source0;
		BlurType blurType = BlurType.get("Box Blur");
		double blurRadius = 11.711711711711711;
		blur(blurInput, blurType, blurRadius, blurOutput);

		// Step HSL_Threshold0:
		Mat hslThreshold0Input = blurOutput;
		double[] hslThreshold0Hue = {100.35971223021585, 121.63822525597269};
		double[] hslThreshold0Saturation = {100.89928057553955, 255.0};
		double[] hslThreshold0Luminance = {0.0, 255.0};
		hslThreshold(hslThreshold0Input, hslThreshold0Hue, hslThreshold0Saturation, hslThreshold0Luminance, hslThreshold0Output);

		// Step Find_Contours0:
		Mat findContours0Input = hslThreshold0Output;
		boolean findContours0ExternalOnly = false;
		findContours(findContours0Input, findContours0ExternalOnly, findContours0Output);

		// Step Filter_Contours0:
		ArrayList<MatOfPoint> filterContours0Contours = findContours0Output;
		double filterContours0MinArea = 3000.0;
		double filterContours0MinPerimeter = 0.0;
		double filterContours0MinWidth = 0.0;
		double filterContours0MaxWidth = 1000.0;
		double filterContours0MinHeight = 0.0;
		double filterContours0MaxHeight = 1000.0;
		double[] filterContours0Solidity = {0, 100};
		double filterContours0MaxVertices = 1000000.0;
		double filterContours0MinVertices = 0.0;
		double filterContours0MinRatio = 0.0;
		double filterContours0MaxRatio = 1000.0;
		filterContours(filterContours0Contours, filterContours0MinArea, filterContours0MinPerimeter, filterContours0MinWidth, filterContours0MaxWidth, filterContours0MinHeight, filterContours0MaxHeight, filterContours0Solidity, filterContours0MaxVertices, filterContours0MinVertices, filterContours0MinRatio, filterContours0MaxRatio, filterContours0Output);

		// Step HSL_Threshold1:
		Mat hslThreshold1Input = blurOutput;
		double[] hslThreshold1Hue = {27.517985611510795, 63.44344874158161};
		double[] hslThreshold1Saturation = {4.586330935251798, 231.0665529010239};
		double[] hslThreshold1Luminance = {64.20863309352518, 246.29692832764505};
		hslThreshold(hslThreshold1Input, hslThreshold1Hue, hslThreshold1Saturation, hslThreshold1Luminance, hslThreshold1Output);

		// Step Find_Contours1:
		Mat findContours1Input = hslThreshold1Output;
		boolean findContours1ExternalOnly = false;
		findContours(findContours1Input, findContours1ExternalOnly, findContours1Output);

		// Step Filter_Contours1:
		ArrayList<MatOfPoint> filterContours1Contours = findContours1Output;
		double filterContours1MinArea = 3000.0;
		double filterContours1MinPerimeter = 0.0;
		double filterContours1MinWidth = 0.0;
		double filterContours1MaxWidth = 1000.0;
		double filterContours1MinHeight = 0.0;
		double filterContours1MaxHeight = 1000.0;
		double[] filterContours1Solidity = {0, 100};
		double filterContours1MaxVertices = 1000000.0;
		double filterContours1MinVertices = 0.0;
		double filterContours1MinRatio = 0.0;
		double filterContours1MaxRatio = 1000.0;
		filterContours(filterContours1Contours, filterContours1MinArea, filterContours1MinPerimeter, filterContours1MinWidth, filterContours1MaxWidth, filterContours1MinHeight, filterContours1MaxHeight, filterContours1Solidity, filterContours1MaxVertices, filterContours1MinVertices, filterContours1MinRatio, filterContours1MaxRatio, filterContours1Output);

		// Step HSL_Threshold2:
		Mat hslThreshold2Input = blurOutput;
		double[] hslThreshold2Hue = {142.37288135593218, 180.0};
		double[] hslThreshold2Saturation = {45.621468926553675, 173.1818181818182};
		double[] hslThreshold2Luminance = {0.0, 148.18181818181816};
		hslThreshold(hslThreshold2Input, hslThreshold2Hue, hslThreshold2Saturation, hslThreshold2Luminance, hslThreshold2Output);

		// Step Find_Contours2:
		Mat findContours2Input = hslThreshold2Output;
		boolean findContours2ExternalOnly = false;
		findContours(findContours2Input, findContours2ExternalOnly, findContours2Output);

		// Step Filter_Contours2:
		ArrayList<MatOfPoint> filterContours2Contours = findContours2Output;
		double filterContours2MinArea = 3000.0;
		double filterContours2MinPerimeter = 0.0;
		double filterContours2MinWidth = 0.0;
		double filterContours2MaxWidth = 1000.0;
		double filterContours2MinHeight = 0.0;
		double filterContours2MaxHeight = 1000.0;
		double[] filterContours2Solidity = {0, 100};
		double filterContours2MaxVertices = 1000000.0;
		double filterContours2MinVertices = 0.0;
		double filterContours2MinRatio = 0.0;
		double filterContours2MaxRatio = 1000.0;
		filterContours(filterContours2Contours, filterContours2MinArea, filterContours2MinPerimeter, filterContours2MinWidth, filterContours2MaxWidth, filterContours2MinHeight, filterContours2MaxHeight, filterContours2Solidity, filterContours2MaxVertices, filterContours2MinVertices, filterContours2MinRatio, filterContours2MaxRatio, filterContours2Output);

		// Step HSL_Threshold3:
		Mat hslThreshold3Input = blurOutput;
		double[] hslThreshold3Hue = {77.96610169491525, 99.7860962566845};
		double[] hslThreshold3Saturation = {0.0, 120.9090909090909};
		double[] hslThreshold3Luminance = {0.0, 255.0};
		hslThreshold(hslThreshold3Input, hslThreshold3Hue, hslThreshold3Saturation, hslThreshold3Luminance, hslThreshold3Output);

		// Step Find_Contours3:
		Mat findContours3Input = hslThreshold3Output;
		boolean findContours3ExternalOnly = false;
		findContours(findContours3Input, findContours3ExternalOnly, findContours3Output);

		// Step Filter_Contours3:
		ArrayList<MatOfPoint> filterContours3Contours = findContours3Output;
		double filterContours3MinArea = 3000.0;
		double filterContours3MinPerimeter = 0.0;
		double filterContours3MinWidth = 0.0;
		double filterContours3MaxWidth = 1000.0;
		double filterContours3MinHeight = 0.0;
		double filterContours3MaxHeight = 1000.0;
		double[] filterContours3Solidity = {0, 100};
		double filterContours3MaxVertices = 1000000.0;
		double filterContours3MinVertices = 0.0;
		double filterContours3MinRatio = 0.0;
		double filterContours3MaxRatio = 1000.0;
		filterContours(filterContours3Contours, filterContours3MinArea, filterContours3MinPerimeter, filterContours3MinWidth, filterContours3MaxWidth, filterContours3MinHeight, filterContours3MaxHeight, filterContours3Solidity, filterContours3MaxVertices, filterContours3MinVertices, filterContours3MinRatio, filterContours3MaxRatio, filterContours3Output);

	}

	/**
	 * This method is a generated getter for the output of a Blur.
	 * @return Mat output from Blur.
	 */
	public Mat blurOutput() {
		return blurOutput;
	}

	/**
	 * This method is a generated getter for the output of a HSL_Threshold.
	 * @return Mat output from HSL_Threshold.
	 */
	public Mat hslThreshold0Output() {
		return hslThreshold0Output;
	}

	/**
	 * This method is a generated getter for the output of a Find_Contours.
	 * @return ArrayList<MatOfPoint> output from Find_Contours.
	 */
	public ArrayList<MatOfPoint> findContours0Output() {
		return findContours0Output;
	}

	/**
	 * This method is a generated getter for the output of a Filter_Contours.
	 * @return ArrayList<MatOfPoint> output from Filter_Contours.
	 */
	public ArrayList<MatOfPoint> filterContours0Output() {
		return filterContours0Output;
	}

	/**
	 * This method is a generated getter for the output of a HSL_Threshold.
	 * @return Mat output from HSL_Threshold.
	 */
	public Mat hslThreshold1Output() {
		return hslThreshold1Output;
	}

	/**
	 * This method is a generated getter for the output of a Find_Contours.
	 * @return ArrayList<MatOfPoint> output from Find_Contours.
	 */
	public ArrayList<MatOfPoint> findContours1Output() {
		return findContours1Output;
	}

	/**
	 * This method is a generated getter for the output of a Filter_Contours.
	 * @return ArrayList<MatOfPoint> output from Filter_Contours.
	 */
	public ArrayList<MatOfPoint> filterContours1Output() {
		return filterContours1Output;
	}

	/**
	 * This method is a generated getter for the output of a HSL_Threshold.
	 * @return Mat output from HSL_Threshold.
	 */
	public Mat hslThreshold2Output() {
		return hslThreshold2Output;
	}

	/**
	 * This method is a generated getter for the output of a Find_Contours.
	 * @return ArrayList<MatOfPoint> output from Find_Contours.
	 */
	public ArrayList<MatOfPoint> findContours2Output() {
		return findContours2Output;
	}

	/**
	 * This method is a generated getter for the output of a Filter_Contours.
	 * @return ArrayList<MatOfPoint> output from Filter_Contours.
	 */
	public ArrayList<MatOfPoint> filterContours2Output() {
		return filterContours2Output;
	}

	/**
	 * This method is a generated getter for the output of a HSL_Threshold.
	 * @return Mat output from HSL_Threshold.
	 */
	public Mat hslThreshold3Output() {
		return hslThreshold3Output;
	}

	/**
	 * This method is a generated getter for the output of a Find_Contours.
	 * @return ArrayList<MatOfPoint> output from Find_Contours.
	 */
	public ArrayList<MatOfPoint> findContours3Output() {
		return findContours3Output;
	}

	/**
	 * This method is a generated getter for the output of a Filter_Contours.
	 * @return ArrayList<MatOfPoint> output from Filter_Contours.
	 */
	public ArrayList<MatOfPoint> filterContours3Output() {
		return filterContours3Output;
	}


	/**
	 * An indication of which type of filter to use for a blur.
	 * Choices are BOX, GAUSSIAN, MEDIAN, and BILATERAL
	 */
	enum BlurType{
		BOX("Box Blur"), GAUSSIAN("Gaussian Blur"), MEDIAN("Median Filter"),
			BILATERAL("Bilateral Filter");

		private final String label;

		BlurType(String label) {
			this.label = label;
		}

		public static BlurType get(String type) {
			if (BILATERAL.label.equals(type)) {
				return BILATERAL;
			}
			else if (GAUSSIAN.label.equals(type)) {
			return GAUSSIAN;
			}
			else if (MEDIAN.label.equals(type)) {
				return MEDIAN;
			}
			else {
				return BOX;
			}
		}

		@Override
		public String toString() {
			return this.label;
		}
	}

	/**
	 * Softens an image using one of several filters.
	 * @param input The image on which to perform the blur.
	 * @param type The blurType to perform.
	 * @param doubleRadius The radius for the blur.
	 * @param output The image in which to store the output.
	 */
	private void blur(Mat input, BlurType type, double doubleRadius,
		Mat output) {
		int radius = (int)(doubleRadius + 0.5);
		int kernelSize;
		switch(type){
			case BOX:
				kernelSize = 2 * radius + 1;
				Imgproc.blur(input, output, new Size(kernelSize, kernelSize));
				break;
			case GAUSSIAN:
				kernelSize = 6 * radius + 1;
				Imgproc.GaussianBlur(input,output, new Size(kernelSize, kernelSize), radius);
				break;
			case MEDIAN:
				kernelSize = 2 * radius + 1;
				Imgproc.medianBlur(input, output, kernelSize);
				break;
			case BILATERAL:
				Imgproc.bilateralFilter(input, output, -1, radius, radius);
				break;
		}
	}

	/**
	 * Segment an image based on hue, saturation, and luminance ranges.
	 *
	 * @param input The image on which to perform the HSL threshold.
	 * @param hue The min and max hue
	 * @param sat The min and max saturation
	 * @param lum The min and max luminance
	 * @param output The image in which to store the output.
	 */
	private void hslThreshold(Mat input, double[] hue, double[] sat, double[] lum,
		Mat out) {
		Imgproc.cvtColor(input, out, Imgproc.COLOR_BGR2HLS);
		Core.inRange(out, new Scalar(hue[0], lum[0], sat[0]),
			new Scalar(hue[1], lum[1], sat[1]), out);
	}

	/**
	 * Sets the values of pixels in a binary image to their distance to the nearest black pixel.
	 * @param input The image on which to perform the Distance Transform.
	 * @param type The Transform.
	 * @param maskSize the size of the mask.
	 * @param output The image in which to store the output.
	 */
	private void findContours(Mat input, boolean externalOnly,
		List<MatOfPoint> contours) {
		Mat hierarchy = new Mat();
		contours.clear();
		int mode;
		if (externalOnly) {
			mode = Imgproc.RETR_EXTERNAL;
		}
		else {
			mode = Imgproc.RETR_LIST;
		}
		int method = Imgproc.CHAIN_APPROX_SIMPLE;
		Imgproc.findContours(input, contours, hierarchy, mode, method);
	}


	/**
	 * Filters out contours that do not meet certain criteria.
	 * @param inputContours is the input list of contours
	 * @param output is the the output list of contours
	 * @param minArea is the minimum area of a contour that will be kept
	 * @param minPerimeter is the minimum perimeter of a contour that will be kept
	 * @param minWidth minimum width of a contour
	 * @param maxWidth maximum width
	 * @param minHeight minimum height
	 * @param maxHeight maximimum height
	 * @param Solidity the minimum and maximum solidity of a contour
	 * @param minVertexCount minimum vertex Count of the contours
	 * @param maxVertexCount maximum vertex Count
	 * @param minRatio minimum ratio of width to height
	 * @param maxRatio maximum ratio of width to height
	 */
	private void filterContours(List<MatOfPoint> inputContours, double minArea,
		double minPerimeter, double minWidth, double maxWidth, double minHeight, double
		maxHeight, double[] solidity, double maxVertexCount, double minVertexCount, double
		minRatio, double maxRatio, List<MatOfPoint> output) {
		final MatOfInt hull = new MatOfInt();
		output.clear();
		//operation
		for (int i = 0; i < inputContours.size(); i++) {
			final MatOfPoint contour = inputContours.get(i);
			final Rect bb = Imgproc.boundingRect(contour);
			if (bb.width < minWidth || bb.width > maxWidth) continue;
			if (bb.height < minHeight || bb.height > maxHeight) continue;
			final double area = Imgproc.contourArea(contour);
			if (area < minArea) continue;
			if (Imgproc.arcLength(new MatOfPoint2f(contour.toArray()), true) < minPerimeter) continue;
			Imgproc.convexHull(contour, hull);
			MatOfPoint mopHull = new MatOfPoint();
			mopHull.create((int) hull.size().height, 1, CvType.CV_32SC2);
			for (int j = 0; j < hull.size().height; j++) {
				int index = (int)hull.get(j, 0)[0];
				double[] point = new double[] { contour.get(index, 0)[0], contour.get(index, 0)[1]};
				mopHull.put(j, 0, point);
			}
			final double solid = 100 * area / Imgproc.contourArea(mopHull);
			if (solid < solidity[0] || solid > solidity[1]) continue;
			if (contour.rows() < minVertexCount || contour.rows() > maxVertexCount)	continue;
			final double ratio = bb.width / (double)bb.height;
			if (ratio < minRatio || ratio > maxRatio) continue;
			output.add(contour);
		}
	}




}
