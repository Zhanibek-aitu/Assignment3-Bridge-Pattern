/**
   Concrete Implementor: Renders shapes as scalable vector graphics.
 */
public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle of radius " + radius + " as vector graphics lines.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square of side " + side + " as vector vectors.");
    }
}