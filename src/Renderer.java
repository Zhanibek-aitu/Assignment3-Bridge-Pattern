/**
    Implementor Interface (Bridge Pattern).
    Declares low-level drawing primitives independent of shape abstractions.
 */
public interface Renderer {
    void renderCircle(double radius);
    void renderSquare(double side);
}