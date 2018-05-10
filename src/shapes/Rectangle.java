package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public double getArea() {
        return length * 2 + width * 2;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }
}
