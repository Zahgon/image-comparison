package com.github.romankh3.image.comparison;

import com.github.romankh3.image.comparison.exception.ImageComparisonException;
import com.github.romankh3.image.comparison.exception.ImageNotFoundException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Tools for the {@link ImageComparison} object.
 */
public final class ImageComparisonUtil {

    /**
     * Make a copy of the {@link BufferedImage} object.
     *
     * @param image the provided image.
     * @return copy of the provided image.
     */
    public static BufferedImage deepCopy(BufferedImage image) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read image from the provided path.
     *
     * @param path the path where contains image.
     * @return the {@link BufferedImage} object of this specific image.
     * @throws ImageComparisonException due to read the image from resources.
     */
    public static BufferedImage readImageFromResources(String path) throws ImageComparisonException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Save image to the provided path.
     *
     * @param pathFile the path to the saving image.
     * @param image the {@link BufferedImage} object of this specific image.
     * @throws ImageComparisonException due to save image.
     */
    public static void saveImage(File pathFile, BufferedImage image) throws ImageComparisonException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Resize image to new dimensions and return new image.
     *
     * @param img the object of the image to be resized.
     * @param newW the new width.
     * @param newH the new height.
     * @return resized {@link BufferedImage} object.
     */
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert image to buffered image.
     *
     * @param img the object of the image to be converted to buffered image.
     * @return the converted buffered image.
     */
    public static BufferedImage toBufferedImage(Image img) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the difference in percent between two buffered images.
     *
     * @param img1 the first image.
     * @param img2 the second image.
     * @return difference percent.
     */
    public static float getDifferencePercent(BufferedImage img1, BufferedImage img2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compare two pixels
     *
     * @param rgb1 the first rgb
     * @param rgb2 the second rgn
     * @return the difference.
     */
    public static int pixelDiff(int rgb1, int rgb2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
