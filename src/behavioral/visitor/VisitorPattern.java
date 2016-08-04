package behavioral.visitor;

import behavioral.visitor.elements.Point2D;
import behavioral.visitor.visitors.Point2DAddVisitor;
import behavioral.visitor.visitors.Point2DMetricVisitor;
import behavioral.visitor.visitors.Point2DPrintVisitor;

public class VisitorPattern {

    public static void main(String[] args) {
        Point2D point = new Point2D(1, 2);
        Point2D otherPoint = new Point2D(3, 4);

        Point2D addPointToOtherPoint = point.accept(new Point2DAddVisitor(), otherPoint);
        addPointToOtherPoint.accept(new Point2DPrintVisitor());

        point.accept(new Point2DMetricVisitor());
        point.accept(new Point2DPrintVisitor());
    }
}
