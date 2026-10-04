/**
   Refined Abstraction: Specializes Shape for square geometries.
 */
public class Square extends Shape {
    private final double side;

    public Square(double side, Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        // Delegating low-level execution to the Implementor bridge
        renderer.renderSquare(side);
    }
}