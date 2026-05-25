package com.github.romankh3.image.comparison.model;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.awt.Point;
import java.util.Objects;

/**
 * Object contained data for a rectangle.
 */
public class Rectangle {

    /**
     * Left Top {@link Point} on the {@link Rectangle}.
     */
    private Point minPoint;

    /**
     * Right bottom {@link Point} on the {@link Rectangle}.
     */
    private Point maxPoint;

    /**
     * Create empty instance of the {@link Rectangle}.
     */
    private Rectangle() {
        minPoint = new Point();
        maxPoint = new Point();
    }

    /**
     * Create clone object based on the provided {@link Rectangle}.
     *
     * @param rectangle provided {@link Rectangle} object.
     */
    public Rectangle(Rectangle rectangle) {
        this.minPoint = new Point(rectangle.getMinPoint().x, rectangle.getMinPoint().y);
        this.maxPoint = new Point(rectangle.getMaxPoint().x, rectangle.getMaxPoint().y);
    }

    /**
     * Create instance of the {@link Rectangle} based on the provided coordinates.
     *
     * @param minX minimal X-coordinate.
     * @param minY minimal Y-coordinate.
     * @param maxX maximal X-coordinate.
     * @param maxY maximal Y-coordinate.
     */
    public Rectangle(int minX, int minY, int maxX, int maxY) {
        this.minPoint = new Point(minX, minY);
        this.maxPoint = new Point(maxX, maxY);
    }

    /**
     * Create default {@link Rectangle} object.
     *
     * @return default rectangle {@link Rectangle}.
     */
    public static Rectangle createDefault() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create instance with zero points.
     *
     * @return created {@link Rectangle} instance.
     */
    public static Rectangle createZero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create new {@link Rectangle} via merging this and that.
     *
     * @param that {@link Rectangle} for merging with this.
     * @return new merged {@link Rectangle}.
     */
    public Rectangle merge(Rectangle that) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check is that rectangle overlap this.
     *
     * @param that {@link Rectangle} which checks with this.
     * @return true if this over lapp that, false otherwise.
     */
    public boolean isOverlapping(Rectangle that) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set default values for rectangle.
     */
    public void setDefaultValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Make zero rectangle.
     */
    public void makeZeroRectangle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Size of the {@link Rectangle}, counted as width x height.
     *
     * @return the size of the {@link Rectangle}.
     */
    public Integer size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Count the width of the {@link Rectangle}.
     * Min and max point are included, so real width is +1px
     *
     * @return rectangle width.
     */
    public int getWidth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Count the height of the {@link Rectangle}.
     * Min and max point are included, so real width is +1px.
     *
     * @return rectangle height.
     */
    public int getHeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check if the provided {@link Point} contains in the {@link Rectangle}.
     *
     * @param point provided {@link Point}.
     * @return {@code true} if provided {@link Point} contains, {@code false} - otherwise.
     */
    boolean containsPoint(Point point) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Point getMinPoint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMinPoint(Point minPoint) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Point getMaxPoint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMaxPoint(Point maxPoint) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
