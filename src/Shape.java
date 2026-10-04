/**
   Abstraction (Bridge Pattern).
   Holds a reference to the Implementor and defines high-level shape operations.
 */
public abstract class Shape {
    // The "Bridge" link to the implementation hierarchy
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    // Allows dynamic runtime switching of the rendering engine
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    // High-level abstraction operation
    public abstract void draw();
}