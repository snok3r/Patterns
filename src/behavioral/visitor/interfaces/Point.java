package behavioral.visitor.interfaces;

public interface Point {

    void accept(PointVisitor v);

    Point accept(PointVisitor v, Point p);
}
