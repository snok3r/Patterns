package behavioral.visitor.visitors;

import behavioral.visitor.elements.Point2D;
import behavioral.visitor.interfaces.PointVisitor;

public class Point2DPrintVisitor implements PointVisitor {

    @Override
    public void visit(Point2D p) {
        System.out.println("x: " + p.getX() + ", y: " + p.getY() + ", metric: " + p.getMetric());
    }

    @Override
    public Point2D visit(Point2D point, Point2D otherPoint) {
        visit(point);
        visit(otherPoint);
        return new Point2D();
    }
}
