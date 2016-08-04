package behavioral.visitor.elements;

import behavioral.visitor.interfaces.Point;
import behavioral.visitor.interfaces.PointVisitor;

public class Point2D implements Point {

    private double metric;
    private double x;
    private double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D otherPoint) {
        x = otherPoint.getX();
        y = otherPoint.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }

    @Override
    public void accept(PointVisitor v) {
        v.visit(this);
    }

    @Override
    public Point2D accept(PointVisitor v, Point p) {
        if (p != null && p instanceof Point2D) {
            Point2D otherPoint = (Point2D) p;
            return v.visit(this, otherPoint);
        } else
            return new Point2D();
    }
}
