// WorkshopTester.java
public class quiz {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Rectangle", 5, 3);
        shapes[1] = new Circle("Circle", 2);

        for (Shape shape : shapes) {
            shape.display();
        }

        // Resizing rectangles
        Resizable resizableRect = (Resizable) shapes[0];
        resizableRect.resize(1.5); // Resizing by scale factor
        System.out.println("Resized Area: " + resizableRect.getResizedArea());
        System.out.println("Resized Perimeter: " + resizableRect.getResizedPerimeter());
    }
}
