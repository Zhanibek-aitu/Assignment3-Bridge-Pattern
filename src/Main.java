/**
   Course: Software Design Patterns
   Assignment 3: Bridge Pattern Implementation
   Author: Zhanibek Abilkhan
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("PART 1: Initial Rendering with Vector Engine");
        Renderer vectorRenderer = new VectorRenderer();
        Shape circle = new Circle(5.0, vectorRenderer);
        Shape square = new Square(10.0, vectorRenderer);

        circle.draw();
        square.draw();

        System.out.println("\nPART 2: Initial Rendering with Raster Engine");
        Renderer rasterRenderer = new RasterRenderer();
        Shape rasterCircle = new Circle(7.5, rasterRenderer);
        rasterCircle.draw();

        System.out.println("\nPART 3: Dynamic Runtime Switching of Implementation");
        System.out.println("Switching existing circle from Vector to Raster dynamically:");
        circle.setRenderer(rasterRenderer);
        circle.draw();
    }
}