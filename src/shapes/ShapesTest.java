package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println("Length = " + myShape.getLength());
        System.out.println("Width = " + myShape.getLength());
        System.out.println("The area of the shape is " + myShape.getArea() + ", and the perimeter is " + myShape.getPerimeter());

    }
}
