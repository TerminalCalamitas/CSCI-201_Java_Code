package edu.unca.csci201;

public class Rectangle {

    Point c1;
    Point c2;

    public Rectangle(Point p1, Point p2) {
	this.c1 = p1;
	this.c2 = p2;
    }

    public boolean isLarger(Rectangle rect) {
	return this.getArea() > rect.getArea();
    }

    public double getArea() {
	double xSide = Math.abs(c1.getX() - c2.getX());
	double ySide = Math.abs(c1.getY() - c2.getY());
	double area = xSide * ySide;

	return area;

    }

}
