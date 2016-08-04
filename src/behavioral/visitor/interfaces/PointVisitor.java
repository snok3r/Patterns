package behavioral.visitor.interfaces;

import behavioral.visitor.elements.Point2D;

public interface PointVisitor {

    void visit(Point2D p);

    Point2D visit(Point2D point, Point2D otherPoint);
}
