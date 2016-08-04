package behavioral.visitor.visitors;

import behavioral.visitor.elements.Point2D;
import behavioral.visitor.interfaces.PointVisitor;

public class Point2DAddVisitor implements PointVisitor {

    @Override
    public void visit(Point2D p) {
    }

    @Override
    public Point2D visit(Point2D point, Point2D otherPoint) {
        double newX = point.getX() + otherPoint.getX();
        double nexY = point.getY() + otherPoint.getY();

        return new Point2D(newX, nexY);
    }
}
