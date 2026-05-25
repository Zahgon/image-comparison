package com.github.romankh3.image.comparison.model;

import com.github.romankh3.image.comparison.ImageComparisonUtil;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collections;
import java.util.List;

/**
 * Data transfer objects which contains all the needed data for result of the comparison.
 */
public class ImageComparisonResult {

    /**
     * {@link BufferedImage} object of the expected.
     */
    private BufferedImage expected;

    /**
     * {@link BufferedImage} object of the actual.
     */
    private BufferedImage actual;

    /**
     * {@link BufferedImage} object of the comparison result.
     */
    private BufferedImage result;

    /**
     * State of the comparison.
     */
    private ImageComparisonState imageComparisonState;

    /**
     * The difference percentage between two images.
     */
    private float differencePercent;

    /**
     * Rectangles of the differences
     */
    private List<Rectangle> rectangles;

    /**
     * Create default instance of the {@link ImageComparisonResult} with {@link ImageComparisonState#SIZE_MISMATCH}.
     *
     * @param expected          expected {@link BufferedImage} object.
     * @param actual            actual {@link BufferedImage} object.
     * @param differencePercent the percent of the differences between images.
     * @return instance of the {@link ImageComparisonResult} object.
     */
    public static ImageComparisonResult defaultSizeMisMatchResult(BufferedImage expected, BufferedImage actual, float differencePercent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create default instance of the {@link ImageComparisonResult} with {@link ImageComparisonState#MISMATCH}.
     *
     * @param expected expected {@link BufferedImage} object.
     * @param actual   actual {@link BufferedImage} object.
     * @param differencePercent the persent of the differences between images.
     * @return instance of the {@link ImageComparisonResult} object.
     */
    public static ImageComparisonResult defaultMisMatchResult(BufferedImage expected, BufferedImage actual, float differencePercent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create default instance of the {@link ImageComparisonResult} with {@link ImageComparisonState#MATCH}.
     *
     * @param expected expected {@link BufferedImage} object.
     * @param actual   actual {@link BufferedImage} object.
     * @return instance of the {@link ImageComparisonResult} object.
     */
    public static ImageComparisonResult defaultMatchResult(BufferedImage expected, BufferedImage actual) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Save the image to the provided {@link File} object.
     *
     * @param file the provided {@link File} object.
     * @return this {@link ImageComparisonResult} object.
     */
    public ImageComparisonResult writeResultTo(File file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BufferedImage getExpected() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonResult setExpected(BufferedImage expected) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BufferedImage getActual() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonResult setActual(BufferedImage actual) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BufferedImage getResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonResult setResult(BufferedImage result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonState getImageComparisonState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonResult setImageComparisonState(ImageComparisonState imageComparisonState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float getDifferencePercent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    ImageComparisonResult setDifferencePercent(float differencePercent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Rectangle> getRectangles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ImageComparisonResult setRectangles(List<Rectangle> rectangles) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
