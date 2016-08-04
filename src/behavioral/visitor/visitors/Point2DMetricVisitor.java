package behavioral.visitor.visitors;

import behavioral.visitor.elements.Point2D;
import behavioral.visitor.interfaces.PointVisitor;

public class Point2DMetricVisitor implements PointVisitor {

    @Override
    public void visit(Point2D p) {
        p.setMetric(Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY()));
    }

    @Override
    public Point2D visit(Point2D point, Point2D otherPoint) {
        return new Point2D();
    }
}
