package edu.unca.csci201;
import java.awt.Point;

public class PointDistanceAndDivide {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3); // Replace with your first point
        Point point2 = new Point(10, 12); // Replace with your second point
        int segmentLength = 8;

        double distance = calculateDistance(point1, point2);

        System.out.println("Distance between points: " + distance);

        int numberOfSegments = (int) Math.ceil(distance / segmentLength);

        System.out.println("Number of segments: " + numberOfSegments);

        double dx = (point2.getX() - point1.getX()) / numberOfSegments;
        double dy = (point2.getY() - point1.getY()) / numberOfSegments;

        System.out.println("Change in x and y coordinates for each segment:");
        for (int i = 0; i < numberOfSegments; i++) {
            double newX = point1.getX() + i * dx;
            double newY = point1.getY() + i * dy;
            System.out.println("Segment " + (i + 1) + ": x=" + newX + ", y=" + newY);
        }
    }

    private static double calculateDistance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
