/**
 * @author Isaac Shoebottom (3429069)
 */
public class TestLine {

    public static void main(String[] args) {

        LineSegment segment1 = new LineSegment(1.0, 1.0, 5.0, 5.0);
        CartesianPoint point1s1 = new CartesianPoint(3.0, 3.0);
        CartesianPoint point2s1 = new CartesianPoint(2.0, 3.0);


        LineSegment segment2 = new LineSegment(2.0, 2.0, 2.0, 6.0);
        CartesianPoint point1s2 = new CartesianPoint(2.0, 4.0);
        CartesianPoint point2s2 = new CartesianPoint(1.0, 5.0);

        if (segment1.isVertical()) {
            System.out.println("Segment 1 is vertical");
        }
        else {
            System.out.println("Segment 1 is not vertical");
        }

        if (segment1.containsPoint(point1s1)){
            System.out.println("Point 1 is on the line segment");
        }
        else {
            System.out.println("Point 1 is not on the line segment");
        }

        if (segment1.containsPoint(point2s1)){
            System.out.println("Point 2 is on the line segment");
        }
        else {
            System.out.println("Point 2 is not on the line segment");
        }

        if (segment2.isVertical()) {
            System.out.println("Segment 2 is vertical");
        }
        else {
            System.out.println("Segment 2 is not vertical");
        }

        if (segment2.containsPoint(point1s2)){
            System.out.println("Point 1 is on the line segment");
        }
        else {
            System.out.println("Point 1 is not on the line segment");
        }

        if (segment2.containsPoint(point2s2)){
            System.out.println("Point 2 is on the line segment");
        }
        else {
            System.out.println("Point 2 is not on the line segment");
        }
    }
}
