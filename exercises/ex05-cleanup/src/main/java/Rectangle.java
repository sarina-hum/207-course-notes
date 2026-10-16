/**
 * Exercise (Copy Style and Documentation) — CheckStyle, JavaDoc.
 * This represents a rectangle with dimensions of a width and a height.
 * Relevant reading: Code Style and Documentation.
 */
public class Rectangle {

  /** The width dimension of this rectangle. */
  private double width;

  /** The height dimension of this rectangle. */
  private double height;

  /**
   * Creates a rectangle with the given width and height.
   *
   * @param width the rectangle's width
   * @param height the rectangle's height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Returns the width of this rectangle. */
  public double getWidth() {
    return this.width;
  }

  /** Returns the height of this rectangle. */
  public double getHeight() {
    return this.height;
  }

  /**
   * Returns the rectangle's area.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return this.width * this.height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor scale
   */
  public void scale(double factor) {
    this.width = this.width * factor;
    this.height = this.height * factor;
  }

  /**
   * Compares whether this rectangle is larger in area than another rectangle.
   *
   * @param other the other rectangle that will be compared to
   * @return true if and only if this rectangle's area is larger
   */
  public boolean isLargerThan(Rectangle other) {
    return this.area() > other.area();
  }
}
