/**
 This class represents a 2D line segment using 2 points.
 @author Natalie Webber
 @author Scott Bateman
 @author Isaac Shoebottom (3429069)
*/
public class LineSegment {

  private CartesianPoint pointA;
  private CartesianPoint pointB;
  

  public LineSegment (double x1, double y1, double x2, double y2) {
    pointA = new CartesianPoint (x1, y1);
    pointB = new CartesianPoint (x2, y2);
  }
  
  public LineSegment (CartesianPoint p1, CartesianPoint p2) {
    pointA = p1;
    pointB = p2;
  }

  public double getLength () {
    return pointA.distance(pointB);
  }

    /**
     * This method checks the cross product and dot products of the line and the given point to check if the point p is on the segment
     * @param p The point that is being tested to be on the segment
     * @return Value of if the returned point is on the segment
     */
  public Boolean containsPoint (CartesianPoint p) {
      double crossProduct;
      crossProduct = ((p.getY() - pointA.getY()) * (pointB.getX() - pointA.getX())) - ((p.getX() - pointA.getX()) * (pointB.getY() - pointA.getY()));
      if (Math.abs(crossProduct) > Math.ulp(1.0)) {
        return false;
      }
      double dotProduct;
      dotProduct = ((p.getX() - pointA.getX()) * (pointB.getX() - pointA.getX())) + ((p.getY() - pointA.getY()) * (pointB.getY() - pointA.getY()));
      if (dotProduct < 0 ) {
        return false;
      }
      double squaredLength;
      squaredLength = ((pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX())) + ((pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY()));
      if (dotProduct > squaredLength) {
        return false;
      }
      return true;
  }

    /**
     * Method to check if the line is vertical (only on one point in the x axis)
     * @return The value of is the line is vertical or not
     */
  public boolean isVertical() {
    if (pointA.getX() == pointB.getX()) {
      return false;
    }
    else {
      return true;
    }
  }
}
