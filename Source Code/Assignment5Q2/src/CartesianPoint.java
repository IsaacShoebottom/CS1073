/**
 This class represents a point in 2D space.
 @author Natalie Webber
*/
public class CartesianPoint {
  private double x;
  private double y;

  public CartesianPoint (double xVal, double yVal) {
    x = xVal;
    y = yVal;
  }

  public double distance (double x2, double y2) {
    double dx = x - x2;
    double dy = y - y2;
    return Math.sqrt(dx*dx + dy*dy);
  }

  public double distance (CartesianPoint other) {
    double dx = x - other.x;
    double dy = y - other.y;
    return Math.sqrt(dx*dx + dy*dy);
  }

  public double getX () { 
    return x;
  }

  public double getY () { 
    return y; 
  }
 
  public void setX (double xVal) {
    x = xVal;
  }

  public void setY (double yVal) {
    y = yVal;
  }

  public void move (double xAmount, double yAmount) {
    x = x + xAmount;
    y = y + yAmount;
  }
}
