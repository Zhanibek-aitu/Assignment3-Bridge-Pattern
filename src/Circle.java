/**
   Refined Abstraction: Specializes Shape for circular geometries.
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Delegating low-level execution to the Implementor bridge
        renderer.renderCircle(radius);
    }
}